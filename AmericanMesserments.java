/**
 * Created by Denys Shabelnyk on 09.07.2018.
 */
public class AmericanMesserments {

    // Global constants
    final double land_mile = 1.60934; // in km
    final double sea_mile = 1.852; // in km
    final double inch = 2.54; // in sm
    final double ft = 0.3048; // im meter
    final double gallon = 3.78541; // in litr
    final double yard = 0.9144; // in meter

    //land mile -> km
    protected double landMiletoKm(double value) { // in miles
        double inKmfromLandMile = 0.0;
        inKmfromLandMile = Math.round(value * land_mile);
        return inKmfromLandMile;
    }

    // km -> land mile
    protected double kmToLandMile(double value) { // in km
        double inLandMile = 0.0;
        inLandMile = Math.round(value/land_mile);
        return inLandMile;
    }

    // sea miles -> km
    protected double seaMilestoKm(double value) { // in miles
        double inKmfromSeaMiles = 0.0;
        inKmfromSeaMiles = Math.round(value * sea_mile);
        return inKmfromSeaMiles;
    }

    // km -> sea miles
    protected double kmToSeaMiles(double value) {
        double inSeaMiles = 0.0;
        inSeaMiles = Math.round(value/sea_mile);
        return inSeaMiles;
    }

    // inch -> sm
    protected double inchToSm(double value) {
        double inSmfromInch = 0.0;
        inSmfromInch = Math.round(value * inch);
        return inSmfromInch;
    }

    // sm ->inch
    protected double smToInch(double value) {
        double inInchFromSm = 0.0;
        inInchFromSm = Math.round(value / inch);
        return inInchFromSm;
    }

    // ft -> meter
    protected double ftToMeter(double value) {
        double inMeterFromFt = 0.0;
        inMeterFromFt = Math.round(value * ft);
        return inMeterFromFt;
    }

    // meter -> ft
    protected double meterToFt(double value) {
        double inFtFromMeter = 0.0;
        inFtFromMeter = Math.round(value/ft);
        return inFtFromMeter;
    }

    // gallon -> litr
    protected double gallToLitr(double value) {
        double inLitrfromGall = 0.0;
        inLitrfromGall = Math.round(value * gallon);
        return inLitrfromGall;
    }

    // litr -> gallon
    protected double litrToGall(double value) {
        double inGallfromLitr = 0.0;
        inGallfromLitr = Math.round(value/gallon);
        return inGallfromLitr;
    }

    // yard -> meter
    protected double yardToMeter(double value) {
        double inMeterFromYard = 0.0;
        inMeterFromYard = Math.round(value * yard);
        return inMeterFromYard;
    }

    // meter -> yard
    protected double meterToYard(double value) {
        double inYardFromMeter = 0.0;
        inYardFromMeter = Math.round(value/yard);
        return inYardFromMeter;
    }

}
