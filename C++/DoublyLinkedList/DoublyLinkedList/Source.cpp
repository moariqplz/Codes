#include "DoublyLinkedList.h"
#include <iostream>
#include <string>
int main()
{
	
	DoublyLinkedList list;
	list.InsertFromBack(5);
	list.InsertFromBack(4);
	list.InsertFromBack(3);
	list.InsertFromBack(2);
	list.InsertFromBack(1);
	list.ToString();
	std::cout << "\n";
	list.InsertFromFront(7);
	list.ToString();
	std::cout << "\n";
 	std::cout << "Removed: " << list.RemoveFirst() << "\n";
	list.ToString();
	std::cout << "\n";
	std::cout << "Removed: " << list.RemoveLast() << "\n";
	list.ToString();
	std::cout << "Peek First" << list.PeekFirst() << "\n";
	std::cout << "Peek Last" << list.PeekLast() << "\n";
	std::cout << "Is list Empty" << list.isEmpty() << "\n";
	std::cout << list.clear() << "\n";
	std::cout << "Is list now Empty " << list.isEmpty() << std::endl;
	
	system("Pause");
	return 0;
}