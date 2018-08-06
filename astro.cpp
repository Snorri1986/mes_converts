/*
Denys Shabelnyk 06.08.2018
C++ class for Messerments Convertor v 2.0(mobile)
Reason: Show some astronomy units
*/

#include <iostream>
using namespace std;

class cpp_astro_units
{
	// functions prototypes
	double showFirstSpaceSpeed();
	double showSecondSpaceSpeed();
	double showThirdSpaceSpeed();
};

// first space speed
double cpp_astro_units::showFirstSpaceSpeed()
{
	double fSS = 7.91;
	return fSS;
}

// second space speed
double cpp_astro_units::showSecondSpaceSpeed()
{
	double sSS = 11.2;
	return sSS;
}

// Third space speed
double cpp_astro_units::showThirdSpaceSpeed()
{
	double tSS = 16.650;
	return tSS;
}