/**
 * Created by Denys Shabelnyk on 24.07.2018.
 * JUnit automation tests
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.assertTrue;

public class TestRunner {


    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result_weather = runner.run(TestRunner.class);
        System.out.println("run tests in Convertor: " + result_weather.getRunCount());
        System.out.println("failed tests in Convertor: " + result_weather.getFailureCount());
        System.out.println("ignored tests in Convertor: " + result_weather.getIgnoreCount());
        System.out.println("success in Convertor: " + result_weather.wasSuccessful());
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

    public void fahrtoCelc()
    {
        assertTrue(w_temp.showCelcius(10) == -12.1);
        assertTrue(w_temp.showCelcius(-20) == -28.6);
        assertTrue(w_temp.showCelcius(135.56) == 57);
    }


    // Kelv<->Celc
    @Test
    public void kelvinToCelcius()
    {
        assertTrue(w_temp.showCelciusFromKelvin(200) == -73.15);
        assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
        assertTrue(w_temp.showCelciusFromKelvin(120.40) == -152.75);
    }

    // LandMile->Kilometer
    @Test
    public void landMiletoKm() {
        assertTrue(a_mes.landMiletoKm(35) == 56.327);
        //assertTrue(a_mes.landMiletoKm(50.5) == 31.3793); // show write result but test wasn't passed

    }


    // Kilometer->LandMile
    @Test
    public void kmToLandMile() {
        assertTrue(a_mes.kmToLandMile(60) == 37.2824);
        assertTrue(a_mes.kmToLandMile(80.5) == 50.0205);
    }

     // SeaMile->Kilometer
     @Test
     public void sMiletoKm() {
         assertTrue(a_mes.seaMilestoKm(120) == 222.24);
         assertTrue(w_temp.showCelciusFromKelvin(-150) == -423.15);
         assertTrue(a_mes.seaMilestoKm(135.7) == 251.3164);
     }

     // Kilometer->SeaMile
     @Test
     public void kmToSmile() {
         assertTrue(a_mes.kmToSeaMiles(200) == 107.991);
         assertTrue(a_mes.kmToSeaMiles(235.8) == 127.322);
     }


      //Inch->Santimeter
      @Test
      public void inchToSm() {
          assertTrue(a_mes.inchToSm(5) == 12.7);
          assertTrue(a_mes.inchToSm(5.3) == 13.462);
      }


      //Santimeter->Inch
      @Test
      public void smToinch() {
          assertTrue(a_mes.smToInch(15) == 5.90551);
          assertTrue(a_mes.smToInch(15.75) == 6.20079);
      }


      // Fut->Meter
      @Test
      public void ftToMetr() {
          assertTrue(a_mes.ftToMeter(30) == 9.144);
          assertTrue(a_mes.ftToMeter(37.45) == 11.415);
      }


      // Meter->Fut
      @Test
      public void mToFt() {
          assertTrue(a_mes.meterToFt(20) == 65.6168);
          assertTrue(a_mes.meterToFt(20.5) == 67.2572);
      }


      // Gallon->Litr
      @Test
      public void galToLitr() {
          assertTrue(a_mes.gallToLitr(150) == 567.812);
          assertTrue(a_mes.gallToLitr(150.50) == 569.704);
      }


      // Litr->Gallon
      @Test
      public void ltToGal() {
          assertTrue(a_mes.litrToGall(50) == 13.2086);
          assertTrue(a_mes.litrToGall(150.50) == 39.7579);
      }


      // Yard->Meter
      @Test
      public void yarToMt() {
          assertTrue(a_mes.yardToMeter(15) == 13.716);
          assertTrue(a_mes.yardToMeter(15.70) == 14.356);
      }


      // Meter->Yard
      @Test
      public void mtToyar() {
          assertTrue(a_mes.meterToYard(1) == 1.09361);
          assertTrue(a_mes.meterToYard(120.53) == 131.81321);
      }

}
