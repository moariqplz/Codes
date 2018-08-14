#include <stdio.h>
#include <iostream>
#include <ctype.h>
#include <string>
#include <vector>

class Rational
{
public:
	Rational();
	Rational(int numerator = 0, int denominator = 1);
	Rational operator+(Rational other);
	Rational operator-(Rational other);
	Rational operator/(Rational other);
	Rational operator*(Rational other);
	bool operator<(Rational other);
	bool operator>(Rational other);
	bool operator==(Rational other);
	bool operator<=(Rational other);
	bool operator>=(Rational other);
	int numerator;
	int denominator;
	Rational Normalize();
private:
	//int numerator;
	//int denominator;
};