/*
Denys Shabelnyk 01.08.2018 
C++ class for Messerments Convertor v 2.0(mobile)
Reason: calculate all values for temperature conversion linked with weather.
*/

#include <iostream>
using namespace std;

class cpp_weather_temp
{
public:
	const int conv_val = 32;
	const double dim_val_f_to_c = 0.55;
	const double dim_val_c_to_f = 1.8;
	double celcius = 0.0F;
	double faringeith = 0.0;
	double kelvin = 0.0;

	// functions prototypes
	double showCelcius(double);
	double showFaringeith(double);
	double showCelciusFromKelvin(double);
};

//in celcius system
double cpp_weather_temp::showCelcius(double grad_val)
{
	celcius = (grad_val - conv_val) * dim_val_f_to_c; // temporary without round
	return celcius;
}

// in Faringeuth system
double cpp_weather_temp::showFaringeith(double grad_val)
{
	faringeith = grad_val*dim_val_c_to_f + conv_val; // temporary without round
	return faringeith;
}

// Kelvin to Celcius
double cpp_weather_temp::showCelciusFromKelvin(double grad_val) {
	const double final_zero = -273.15;
	if (grad_val == 0) return final_zero;
	const double kelvin_const = 273.15;  // C = K - 273;
	double grad_in_celcius = 0.0;
	grad_in_celcius = grad_val - kelvin_const; // temporary without round
	return grad_in_celcius;
}

// temporary
int main()
{
	return 0;
}


