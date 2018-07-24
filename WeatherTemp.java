/* Class for weather termometer */
public class WeatherTemp {
    protected final int conv_val = 32;
    protected final double dim_val_f_to_c = 0.55;
    protected final double dim_val_c_to_f = 1.8;
    protected double celcius = 0.0;
    protected double faringeith = 0.0;
    protected double kelvin = 0.0; // 04.07.2018
    // in Celcius system
    protected double showCelcius(double grad_val) {   // test 04.07.2018
        //String answer = new String("Grade in Celcius ");
        celcius = (grad_val - conv_val) * dim_val_f_to_c;
        return celcius;
    }
     // in Faringeuth system
    protected double showFaringeith(double grad_val) {  // test 04.07.2018
        //String answer = new String("Grade in Faringeith ");
        faringeith = grad_val*dim_val_c_to_f + conv_val;
        return faringeith;
    }

    // Kelvin to Celcius 04.07.2018
    protected double showCelciusFromKelvin(double grad_val) {
        final double final_zero = -273.15;
        if (grad_val == 0) return final_zero;
        final int kelvin_const = 273;  // C = K - 273;
        double grad_in_celcius = 0.0;
        //if (grad_val == 0) return final_zero;
        grad_in_celcius = grad_val - kelvin_const;
        return grad_in_celcius;
    }
    //
}
