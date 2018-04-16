#include "Overload.h" 

using namespace std;

int main()
{
	system("color 1");
	Rational rational1(4, 5); //adding values for the class
	Rational rational2(6, 7);
	Rational result = rational1 + rational2; // add them togather
	result.Normalize();
	cout << result.numerator << " / "; //setting it to where it is shows / from the equation
	cout << result.denominator << endl;
	result = rational1 - rational2; // now making it where it subtracts
	result.Normalize();
	cout << result.numerator << " / ";
	cout << result.denominator << endl;
	result = rational1 * rational2; // making it where it multiples
	result.Normalize();
	cout << result.numerator << " / ";
	cout << result.denominator << endl;
	result = rational1 / rational2; // making it where it devides
	result.Normalize();
	cout << result.numerator << " / ";
	cout << result.denominator << endl;
	bool comparisonResult;
	comparisonResult = (rational1 < rational2); //checks for if rational 1 is less than rational 2
	cout << (comparisonResult ? "True" : "False") << endl;
	comparisonResult = (rational1 > rational2);
	cout << (comparisonResult ? "True" : "False") << endl;
	comparisonResult = (rational1 == rational2);
	cout << (comparisonResult ? "True" : "False") << endl;
	comparisonResult = (rational1 >= rational2);
	cout << (comparisonResult ? "True" : "False") << endl;
	comparisonResult = (rational1 <= rational2);
	cout << (comparisonResult ? "True" : "False") << endl;




	system("pause");
}