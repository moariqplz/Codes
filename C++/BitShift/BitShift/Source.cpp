#include <iostream>



int BitShifting(int, int);

int main()
{
	std::cout << "today we are going to be to be working with bitshift operators!" << std::endl;
	int firstNumber, secondNumber;
	std::cout << "Would you please enter in a number: " << std::endl;
	std::cin >> firstNumber;
	std::cout << "Please insert a second number: " << std::endl;
	std::cin >> secondNumber;
	
	std::cout << "Using bitshifting the answer is: " << BitShifting(firstNumber, secondNumber) << std::endl;

	system("pause");
}

int BitShifting(int firstNum, int secondNum)
{
	int solution = firstNum << secondNum;
	return solution;
}