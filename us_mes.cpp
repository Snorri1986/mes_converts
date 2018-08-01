/*
Denys Shabelnyk 01.08.2018
C++ class for Messerments Convertor v 2.0(mobile)
Reason: calculate all values from U.S. system to Metric system conversion 
*/

#include <iostream>
using namespace std;

class cpp_usa_mess
{
	// class constants
public:
	const double land_mile = 1.60934; // in km
	const double sea_mile = 1.852; // in km
	const double inch = 2.54; // in sm
	const double ft = 0.3048; // im meter
	const double gallon = 3.78541; // in litr
	const double yard = 0.9144; // in meter

	// functions prototypes
	double landMiletoKm(double);
	double kmToLandMile(double);
	double seaMilestoKm(double);
	double kmToSeaMiles(double);
	double inchToSm(double);
	double smToInch(double);
	double ftToMeter(double);
	double meterToFt(double);
	double gallToLitr(double);
	double litrToGall(double);
	double yardToMeter(double);
	double meterToYard(double);
};

//land mile -> km
double cpp_usa_mess::landMiletoKm(double value) { 
	double inKmfromLandMile = 0.0;
	inKmfromLandMile = value * land_mile;
	return inKmfromLandMile;
}

// km -> land mile
double cpp_usa_mess::kmToLandMile(double value) { // in km
	double inLandMile = 0.0;
	inLandMile = value / land_mile;
	return inLandMile;
}

// sea miles -> km
double cpp_usa_mess::seaMilestoKm(double value) { // in miles
	double inKmfromSeaMiles = 0.0;
	inKmfromSeaMiles = value * sea_mile;
	return inKmfromSeaMiles;
}

// km -> sea miles
double cpp_usa_mess::kmToSeaMiles(double value) {
	double inSeaMiles = 0.0;
	inSeaMiles = value / sea_mile;
	return inSeaMiles;
}

// inch -> sm
double cpp_usa_mess::inchToSm(double value) {
	double inSmfromInch = 0.0;
	inSmfromInch = value * inch;
	return inSmfromInch;
}

// sm ->inch
double cpp_usa_mess::smToInch(double value) {
	double inInchFromSm = 0.0;
	inInchFromSm = value / inch;
	return inInchFromSm;
}

// ft -> meter
double cpp_usa_mess::ftToMeter(double value) {
	double inMeterFromFt = 0.0;
	inMeterFromFt = value * ft;
	return inMeterFromFt;
}

// meter -> ft
double cpp_usa_mess::meterToFt(double value) {
	double inFtFromMeter = 0.0;
	inFtFromMeter = value / ft;
	return inFtFromMeter;
}

// gallon -> litr
double cpp_usa_mess::gallToLitr(double value) {
	double inLitrfromGall = 0.0;
	inLitrfromGall = value * gallon;
	return inLitrfromGall;
}

// litr -> gallon
double cpp_usa_mess::litrToGall(double value) {
	double inGallfromLitr = 0.0;
	inGallfromLitr = value / gallon;
	return inGallfromLitr;
}

// yard -> meter
double cpp_usa_mess::yardToMeter(double value) {
	double inMeterFromYard = 0.0;
	inMeterFromYard = value * yard;
	return inMeterFromYard;
}

// meter -> yard
double cpp_usa_mess::meterToYard(double value) {
	double inYardFromMeter = 0.0;
	inYardFromMeter = value / yard;
	return inYardFromMeter;
}

