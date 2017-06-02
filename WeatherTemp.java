/* Class for weather termometer */
public class WeatherTemp {
    protected final int conv_val = 32;
    protected final double dim_val_f_to_c = 0.55;
    protected final double dim_val_c_to_f = 1.8;
    protected double celcius = 0.0;
    protected double faringeith = 0.0;
    // in Celcius system
    protected void showCelcius(int grad_val) {
        String answer = new String("Grade in Celcius ");
        celcius = (grad_val - conv_val) * dim_val_f_to_c;
        System.out.println(answer + celcius + " C");
    }
     // in Faringeuth system
    protected void showFaringeith(int grad_val) {
        String answer = new String("Grade in Faringeith ");
        faringeith = grad_val*dim_val_c_to_f + conv_val;
        System.out.println(answer + faringeith + " F");
    }
}
