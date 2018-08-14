#pragma once
#include "Security.h"
#include <fstream>
using namespace System;
using namespace MySql::Data::MySqlClient;
using namespace MySql::Data;
using namespace System::Collections;
using namespace System::IO;
public ref class database
{
private:
	String^ conString = ("Database=acsm_981cd5394557e4a;Data Source=us-cdbr-azure-southcentral-e.cloudapp.net;User Id=b35cc3355c34a7;Password=4cd5465ac83812a");
		// Retrieve Login Info
		UTF8Encoding^ utf8 = gcnew UTF8Encoding;
		Service^ security = gcnew Service;

		MySqlConnection^ connection()
		{
			MySqlConnection^ conDataBase = gcnew MySqlConnection(conString);
			return conDataBase;
		}
		
	//
public:
	//Create a function that takes a username and password
	//pull password out of database to compare to encrpyed password
	//if they dont match return a bool saying flase

	bool createLogin(String^ userName, String^ password)
	{
		MySqlConnection^ conDataBase = connection();

		String^ encPassword = toString(security->EncryptText(utf8, password));
		MySqlCommand^ cmdDataBase = gcnew MySqlCommand("INSERT INTO user_login (username, password) VALUES ('" + userName + "'" + encPassword + "'");
		MySqlDataReader^ reader;

		try
		{
			conDataBase->Open();
			reader = cmdDataBase->ExecuteReader;
			conDataBase->Close();
			if (reader->RecordsAffected == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			catch (Exception^)
			{
				throw;
			}

	}
	String^ retriveFiles(String^ userName)
	{
		MySqlConnection^ conDataBase = connection();
		MySqlCommand^ cmdDataBase = gcnew MySqlCommand("Select * FROM filetable WHERE username='" + userName + "'", conDataBase);
		MySqlDataReader^ reader;
		String^ fileData;
		try
		{
			conDataBase->Open();
			reader = cmdDataBase->ExecuteReader();
			while (reader->Read())
			{
				String^ fileOwner = reader->GetString(2);
				if (fileOwner == userName)
				{
					fileData = reader->GetString(1);
					StreamWriter^ sw = gcnew StreamWriter("test.txt");
					sw->WriteLine(fileData);
					sw->Close();
				}
			}

		}
		catch (Exception^)
		{
			throw;
		}
		conDataBase->Close();
		return " ";
	}
	bool comparePassword(String^ userName, String^ password)
	{
		MySqlConnection^ conDataBase =  connection();
		MySqlCommand^ cmdDataBase = gcnew MySqlCommand("Select * FROM user_login WHERE username='" + userName + "'", conDataBase);
		MySqlDataReader^ reader;

		try
		{
			conDataBase->Open();
			reader = cmdDataBase->ExecuteReader();

			while (reader->Read())
			{
				String^ encPassword = reader->GetString(2);
				array<String^>^ bytes;

				bytes = encPassword->Split(' ');

				array<Byte>^ newBytes = gcnew array<Byte>(bytes->Length);

				for (int i = 0; i < bytes->Length; i++)
				{
					newBytes[i] = Convert::ToByte(bytes[i]);
				}
				String^ decryptPass = security->DecryptText(utf8, newBytes);

				if (decryptPass == password)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			conDataBase->Close();
		}
		catch (Exception^)
		{
			throw;
		}
		return false;

	}
private:
	String^ toString(array<Byte>^ arr)
	{
		String^ test;
		for (int i = 0; i <= arr->Length; i++)
		{
			if (i == arr->Length - 1)
			{
				test += arr[i];
			}
			else
			{
				test += arr[i] + " ";
			}
		}
	}
};