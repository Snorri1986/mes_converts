/* Class for weather termometer */
public class WeatherTemp {
    protected final int conv_val = 32;
    protected final double dim_val_f_to_c = 0.55;
    protected final double dim_val_c_to_f = 1.8;
    protected double celcius = 0.0F;
    protected double faringeith = 0.0;
    protected double kelvin = 0.0;

    // in Celcius system
    protected double showCelcius(double grad_val) {
        celcius = Math.round((grad_val - conv_val) * dim_val_f_to_c*10);
        celcius = celcius/10;
        return celcius;
    }
     // in Faringeuth system
    protected double showFaringeith(double grad_val) {
        faringeith = grad_val*dim_val_c_to_f + conv_val;
        return faringeith;
    }

    // Kelvin to Celcius
    protected double showCelciusFromKelvin(double grad_val) {
        final double final_zero = -273.15;
        if (grad_val == 0) return final_zero;
        final double kelvin_const = 273.15;  // C = K - 273;
        double grad_in_celcius = 0.0;
        grad_in_celcius = Math.round((grad_val - kelvin_const)*100);
        grad_in_celcius = grad_in_celcius / 100;
        return grad_in_celcius;
    }
}
