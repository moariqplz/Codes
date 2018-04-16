#pragma once

#include <iostream>
#include <string>

typedef struct node
{
	int data;               // will store information
	node *next;			 // the reference to the next node
	node *prev;
};
class DoublyLinkedList{
public:
	node *head;
	node *tail;
	DoublyLinkedList();
	void InsertFromFront(int info);
	void InsertFromBack(int info);
	void ToString();
	int PeekFirst();
	int PeekLast();
	int RemoveFirst();
	int RemoveLast();
	bool isEmpty();
	std::string clear();

private:
	int size;
};
