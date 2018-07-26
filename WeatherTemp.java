/* Class for weather termometer */
public class WeatherTemp {
    protected final int conv_val = 32;
    protected final double dim_val_f_to_c = 0.55;
    protected final double dim_val_c_to_f = 1.8;
    protected double celcius = 0.0F;
    protected double faringeith = 0.0;
    protected double kelvin = 0.0; // 04.07.2018

    // in Celcius system
    protected double showCelcius(double grad_val) {   // test 04.07.2018
        // String answer = new String("Grade in Celcius ");
        celcius = Math.round((grad_val - conv_val) * dim_val_f_to_c*10);
        celcius = celcius/10;
        return celcius;
    }
     // in Faringeuth system
    protected double showFaringeith(double grad_val) {  // test 04.07.2018
        //String answer = new String("Grade in Faringeith ");

        faringeith = grad_val*dim_val_c_to_f + conv_val;  // test code
        return faringeith;
    }

    // Kelvin to Celcius 04.07.2018
    protected double showCelciusFromKelvin(double grad_val) {
        final double final_zero = -273.15;
        if (grad_val == 0) return final_zero;
        final double kelvin_const = 273.15;  // C = K - 273; // test code
        double grad_in_celcius = 0.0;
        //if (grad_val == 0) return final_zero;
        grad_in_celcius = Math.round((grad_val - kelvin_const)*100); // test code
        grad_in_celcius = grad_in_celcius / 100; // test code
        return grad_in_celcius;
    }
    //
}
