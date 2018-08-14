#include "Overload.h"
using namespace std;

Rational::Rational()// creating the default constructor
{
	cout << "Default." << endl;
}

Rational::Rational(int numerator, int denominator)// creating the numerator and denominator
{
	this->denominator = denominator;
	this->numerator = numerator;
}

void Example() // creating the example equation
{
	Rational zero();
	Rational wholeNumber(1);
	Rational fraction(1, 2);
}
Rational Rational::operator+(Rational other) //overloading the + operator
{
	int denominator1 = this->denominator;
	int numerator1 = this->numerator;
	int denominator2 = other.denominator;
	int numerator2 = other.numerator;
	int resultingNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);
	int resultingDenominator = (denominator2 * denominator1);
	return Rational(resultingNumerator, resultingDenominator);
}
Rational Rational::operator-(Rational other)//overloading the - operator
{
	int denominator1 = this->denominator;
	int numerator1 = this->numerator;
	int denominator2 = other.denominator;
	int numerator2 = other.numerator;
	int resultingNumerator = (numerator1 * denominator2) - (numerator2 * denominator1);
	int resultingDenominator = (denominator2 * denominator1);
	return Rational(resultingNumerator, resultingDenominator);
}
Rational Rational::operator/(Rational other)//overloading the / operator
{
	int denominator1 = this->denominator; // making denominator1 == to denominator from rational class
	int numerator1 = this->numerator; // making numerator == to numerator from rational class
	int denominator2 = other.denominator;// using the second rational function I used .Other to pickup for the other one
	int numerator2 = other.numerator;// using the second rational function I used .Other to pickup for the other one
	int resultingNumerator = numerator1 * denominator2; // getting a return value
	int resultingDenominator = denominator1 * numerator2; // getting a return value
	return Rational(resultingNumerator, resultingDenominator);
}
Rational Rational::operator*(Rational other)//overloading the * operator
{
	int denominator1 = this->denominator;
	int numerator1 = this->numerator;
	int denominator2 = other.denominator;
	int numerator2 = other.numerator;
	int resultingNumerator = numerator1 * numerator2;
	int resultingDenominator = denominator1 * denominator2;
	return Rational(resultingNumerator, resultingDenominator);
}
bool Rational::operator<(Rational other)
{
	return (float(numerator) / float(denominator)) < (float(other.numerator) / float(other.denominator)); //added a float to cast a float over it so it would not make them an int
	// when I tried to use float for the class caused problems/
}
bool Rational::operator>(Rational other)
{
	return (float(numerator) / float(denominator)) > (float(other.numerator) / float(other.denominator));
}
bool Rational::operator==(Rational other)
{
	return (float(numerator) / float(denominator)) == (float(other.numerator) / float(other.denominator));
}
bool Rational::operator<=(Rational other)
{
	return (float(numerator) / float(denominator)) <= (float(other.numerator) / float(other.denominator));
}
bool Rational::operator>=(Rational other)
{
	return (float(numerator) / float(denominator)) >= (float(other.numerator) / float(other.denominator));
}
Rational Rational::Normalize() // this is reducing the variable to its lowest form.
{
	bool check = true;
	while (check == true)
	{
		if ((numerator % 2 == 0) && (denominator % 2 == 0))
		{
			numerator = numerator / 2;
			denominator = denominator / 2;
			check = true;
		}
		else
		{
			check = false;
		}
	}
	return Rational(numerator, denominator); //returning the reduced value.
}
