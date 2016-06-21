#include <iostream>
#include <string>

typedef struct node
{
	int data;               // will store information
	node *next;             // the reference to the next node
};
// prototype functions
void Insert(int info);
void Print();
void Find();
void Delete();
void Minimum();
void Maximum();
// variables
bool UILoop = true;
int amount = 0;
int pos = 0;
node *head;
int main()
{
	// Initialization of the nodes
	head = NULL; // creating a empty link list
	std::string answer;//creating my answer variable to see if they would like to do it agian
	while (UILoop == true)
	{
		char choice;
		std::cout << "Would you like to (I)nsert data\nWould you like to (F)ind Data\nWould you like to (D)elete \nWould you like to find the (M)inimum\nOr would you like to find the M(A)ximum" << std::endl; //creating the options for the user
		std::cout << "NOTE: Press one of the letters that is surrounded by () to choose\n";
		std::cin >> choice; // taking the choice they made
		switch (choice)
		{
		case 'I': // inserts the data that they use
			std::cin.ignore();
			int nodeAmount;
	
			std::cout << "How many nodes would you like to create?" << std::endl;
			std::cin >> nodeAmount;
			for (int i = 0; i < nodeAmount; i++)
			{
				int userInput;
				std::cout << "What number would you like to put in: " << std::endl;
				std::cin >> userInput;
				Insert(userInput);

			}
			std::cout << "Would you like to do something else? " << std::endl; // asking if they would like to d anything else
			std::cin >> answer;
			if (answer == "No" || answer == "no")
			{
				UILoop = false;
			}
			break;
		case 'F': //Find the data
			Find(); // calling the find function
			std::cout << "Would you like to do something else? " << std::endl;
			std::cin >> answer;
			if (answer == "No" || answer == "no")
			{
				UILoop = false;
			}
			break;
		case 'D': //delete
			Delete(); // calling the delete function
			std::cout << "Would you like to do something else? " << std::endl;
			std::cin >> answer;
			if (answer == "No" || answer == "no")
			{
				UILoop = false;
			}
			break;
		case 'M': // minimum
			Minimum(); // calling the minimum function
			std::cout << "Would you like to do something else? " << std::endl;
			std::cin >> answer;
			if (answer == "No" || answer == "no")
			{
				UILoop = false;
			}
			break;
		case 'A': // Maximum
			Maximum();// calling the maximum function
			std::cout << "Would you like to do something else? " << std::endl;
			std::cin >> answer;
			if (answer == "No" || answer == "no")
			{
				UILoop = false;
			}
			break;
		default: //exception handling
			std::cout << "Your choice was invalid please try again\n";
			std::cin.ignore();
			break;
		}

	}
	std::cout << "Your current list is " << std::endl; //setting up a clean format for list
	Print(); // calling print function
	system("pause");
	return 0;

}


void Insert(int info)
{
	node *temp = new node; // creating the node
	temp->data = info; //setting the data to the info input
	temp->next = NULL; // setting next to NULL 
	if (head == NULL) // If head == null set head to temp
	{
		head = temp;
	}
	else // otherwise do thsi
	{
		node *temp2 = head; // creating another node
		while (temp2->next != NULL) // checking if the temp->next != null if it doesnt 
		{
			temp2 = temp2->next; //set temp2 to temp->next so go to the next one
		}
		temp2->next = temp; //goes the next one.
	}
}
void Print()
{
	node *temp = head;
	while (temp != NULL)
	{
		std::cout << temp->data << " " << std::endl; // prints out the data from temp
		temp = temp->next;// going the the next list portion
	}

}
void Find()
{
	node *temp1;                         // create a temporary node
	temp1 = (node*)malloc(sizeof(node)); // allocate space for node
	temp1 = head;                  // transfer the address of head to temp1
	int nodeNumber;
	node *prevTemp;                     // creating a temporary node
	prevTemp = (node*)malloc(sizeof(node));   
	prevTemp = temp1;       // transfer the address of temp1 to prevTemp
	std::cout << "Enter the number of the node you would like to find: ";
	std::cin >> nodeNumber;                    // takes the  location
	for (int i = 1; i < nodeNumber; i++)
	{
		prevTemp = temp1;                    // store previous node
		temp1 = temp1->next;                 // store current node

	}  
	int info;
	info = temp1->data;
	std::cout << "The number in this node is " << info << std::endl;
}
void Delete()
{
	node *temp1;                         // create a temporary node
	temp1 = (node*)malloc(sizeof(node)); // allocate space for node
	temp1 = head;                   // transfer the address of head to temp1
	int nodeNumber;
	node *prevTemp;                     // create a temporary node
	prevTemp = (node*)malloc(sizeof(node));  
	prevTemp = temp1;       // transfer the address of temp1 to prevTemp
	std::cout << "Enter the number of the node you would like to delete: ";
	std::cin >> nodeNumber;                    // take location
	for (int i = 1; i < nodeNumber; i++)
	{
		prevTemp = temp1;                    // store previous node
		temp1 = temp1->next;                 // store current node

	}
	prevTemp->next = temp1->next;  // transfer the address of temp1->next to prevTemp->next
	free(temp1);
}
void Minimum() //Minimum function
{
	int minimum = 100000; //setting minimum to a high number so it can be the top one
	node *temp = head; //creating a temp node
	while (temp != NULL) // while it is not null
	{
		if (temp->data < minimum) // check if there is a lower number than the current minimum
		{
			minimum = temp->data; //replaces the minimum with the data

		}
		temp = temp->next; // goes the next node

	}
	std::cout << "The lowest number is " << minimum << std::endl; 
}
void Maximum() // Maximum function does the same thing as minimum but in reverse
{
	int maximum = 0;
	node *temp = head;
	while (temp != NULL)
	{
		if (temp->data > maximum)
		{
			maximum = temp->data;

		}
		temp = temp->next;

	}
	std::cout << "The highest number is " << maximum << std::endl;
}