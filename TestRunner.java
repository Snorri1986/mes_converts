/**
 * Created by Denys Shabelnyk on 24.07.2018.
 * JUnit automation tests
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.assertTrue;

public class TestRunner {


    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result_weather = runner.run(WeatherTemp.class);
        System.out.println("run tests in WeatherTemp: " + result_weather.getRunCount());
        System.out.println("failed tests in WeatherTemp: " + result_weather.getFailureCount());
        System.out.println("ignored tests in WeatherTemp: " + result_weather.getIgnoreCount());
        System.out.println("success in WeatherTemp: " + result_weather.wasSuccessful());
        System.out.println("\n");

        Result result_american = runner.run(AmericanMesserments.class);
        System.out.println("run tests in AmericanMesserments: " + result_american.getRunCount());
        System.out.println("failed tests in AmericanMesserments: " + result_american.getFailureCount());
        System.out.println("ignored tests in AmericanMesserments: " + result_american.getIgnoreCount());
        System.out.println("success in AmericanMesserments: " + result_american.wasSuccessful());
        System.out.println("\n");

        Result result_astronomy = runner.run(AstronomyMesserments.class);
        System.out.println("run tests in AstronomyMesserments: " + result_astronomy.getRunCount());
        System.out.println("failed tests in AstronomyMesserments: " + result_astronomy.getFailureCount());
        System.out.println("ignored tests in AstronomyMesserments: " + result_astronomy.getIgnoreCount());
        System.out.println("success in AstronomyMesserments: " + result_astronomy.wasSuccessful());
        System.out.println("\n");
    }

    // class instances
    public WeatherTemp w_temp;
    public AmericanMesserments a_mes;
    public AstronomyMesserments astr_mes;


    // objects initialization
    @Before
    public void init() {
        w_temp = new WeatherTemp();
        a_mes = new AmericanMesserments();
        astr_mes = new AstronomyMesserments();
    }

    // objects delete
    @After
    public void tearDown() {
        w_temp = null;
        a_mes = null;
        astr_mes = null;
    }

    // Weather Conversion

    // Celc<->Fahr
    @Test
    public void celcToFahr()
    {
        assertTrue(w_temp.showFaringeith(-20.0) == -4);
        assertTrue(w_temp.showFaringeith(30) == 86);
    }


    // Fahr<->Celc
    @Test
    @Ignore
    public void fahrtoCelc()
    {
        assertTrue(w_temp.showCelcius(10) == -12.1);
        assertTrue(w_temp.showCelcius(-20) == -28.6); // wrong result  bug!!!
        assertTrue(w_temp.showCelcius(135.56) == 57); // wrong result
    }


    // Kelv<->Celc
    @Test
    public void kelvinToCelcius()
    {
        assertTrue(w_temp.showCelciusFromKelvin(200) == -73.15);  // bug!!!
        assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
        assertTrue(w_temp.showCelciusFromKelvin(120.40) == -153.15);
    }

    // LandMile->Kilometer
    @Test
    public void landMiletoKm() {
        assertTrue(a_mes.landMiletoKm(35) == 56.327);
        //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
        assertTrue(a_mes.landMiletoKm(50.5) == 80.4672);

    }


    // Kilometer->LandMile
    @Test
    public void kmToLandMile() {
        assertTrue(a_mes.kmToLandMile(60) == 37.2823);
        //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
        assertTrue(a_mes.kmToLandMile(80.5) == 49.7097);
    }

     // SeaMile->Kilometer
     @Test
     public void sMiletoKm() {
         assertTrue(a_mes.seaMilestoKm(120) == 222.24);
         //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
         assertTrue(a_mes.seaMilestoKm(135.7) == 251.3164);
     }

     // Kilometer->SeaMile
     @Test
     public void kmToSmile() {
         assertTrue(a_mes.kmToSeaMiles(200) == 107.991);
         //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
         assertTrue(a_mes.kmToSeaMiles(235.8) == 127.32181);
     }


      //Inch->Santimeter
      @Test
      public void inchToSm() {
          assertTrue(a_mes.inchToSm(5) == 12.7);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.inchToSm(5.3) == 13.462);
      }


      //Santimeter->Inch
      @Test
      public void smToinch() {
          assertTrue(a_mes.smToInch(15) == 5.90551);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.smToInch(15.75) == 5.9055118);
      }


      // Fut->Meter
      @Test
      public void ftToMetr() {
          assertTrue(a_mes.ftToMeter(30) == 9.144);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.ftToMeter(37.45) == 11.2776);
      }


      // Meter->Fut
      @Test
      public void mToFt() {
          assertTrue(a_mes.meterToFt(20) == 65.6168);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.meterToFt(20.5) == 67.25722);
      }


      // Gallon->Litr
      @Test
      public void galToLitr() {
          assertTrue(a_mes.gallToLitr(150) == 567.812);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.gallToLitr(150.50) == 569.70447);
      }


      // Litr->Gallon
      @Test
      public void ltToGal() {
          assertTrue(a_mes.litrToGall(50) == 13.2086);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.litrToGall(150.50) == 39.757894);
      }


      // Yard->Meter
      @Test
      public void yarToMt() {
          assertTrue(a_mes.yardToMeter(15) == 13.716);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          assertTrue(a_mes.yardToMeter(15.70) == 14.35608);
      }


      // Meter->Yard
      @Test
      public void mtToyar() {
          assertTrue(a_mes.meterToYard(1) == 1.09361);
          //assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
          //assertTrue(a_mes.meterToYard(120.53) == 131.233596);
      }

}
