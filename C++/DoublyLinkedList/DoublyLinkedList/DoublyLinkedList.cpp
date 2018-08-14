#include "DoublyLinkedList.h"

DoublyLinkedList::DoublyLinkedList()
{
	head = NULL;
	tail = NULL;
}



	void DoublyLinkedList::InsertFromFront(int info)
	{
		node *temp = new node;
		temp->data = info;
		if (head == NULL)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			temp->next = head;
			head->prev= temp;
			head = temp;
		}
		size++;
	}
	void DoublyLinkedList::InsertFromBack(int info)
	{
		node *temp = new node; // creating the node
		temp->data = info; //setting the data to the info input
		temp->next = NULL; // setting next to NULL 
		if (head == NULL) // If head == null set head to temp
		{
			temp->prev = NULL;
			head = temp;
			tail = temp;
		}
		else
		{
			temp->prev = tail;
			tail->next = temp;
			tail = temp;
		}
		size++;
	}

	void DoublyLinkedList::ToString()
	{
		node *temp = head;
		while (temp != NULL)
		{
			std::cout << "|" << temp->data << "|";// prints out the data from temp
			temp = temp->next;// going the the next list portion
		}
	}

	int DoublyLinkedList::PeekFirst() // looks at heads data
	{
		return head->data;
	}

	int DoublyLinkedList::PeekLast() //peeks tails data
	{
		return tail->data;
	}

	int DoublyLinkedList::RemoveFirst() //removes first
	{
		node* temp = new node();
		temp = head;
		head = head->next;
		head->prev = NULL;
		size--;
		return temp->data;
	}

	int DoublyLinkedList::RemoveLast() // Removes last
	{
		node* temp = new node();
		temp = tail;
		tail = tail->prev;
		tail->next = NULL;
		size--;
		return temp->data;
	}

	bool DoublyLinkedList::isEmpty() // Checks if it is empty
	{
		return size == 0;
	}

	std::string DoublyLinkedList::clear() //Clears the list out 
	{

		while (!tail->prev == NULL) //Runs a while loop and just calls  removes last
		{
			this->RemoveLast();
		}
		tail = NULL; //sets last value to NULL 
		size = 0; //makes sure size is 0
		return "Cleared List";
	}
	



