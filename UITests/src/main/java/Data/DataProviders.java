package Data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    /*
    I created this class to show a basic implementation of Data providers, but this data can come from JSON, Excel or Data bases.
     */

    @DataProvider(name = "dimensionsValues")
    public static Object[][] dimensionsValues() {
        return new Object[][]{
                {"Length", "Foot", "Centimeter", "4", "121.92"},
                {"Length", "Inch", "Centimeter", "56.23", "142.8242"},
                {"Area", "Hectare", "Square meter", "5", "50 000"},
                {"Area", "Decare", "Square centimeter", "2", "20 000 000"},
                {"Volume", "Quart", "Bushel", "2", "0.0625"},
                {"Volume", "Pint", "Peck", "23", "1.4375"},
                {"Volume", "Pint", "Cup", "13", "000000"}
        };
    }

    @DataProvider(name = "dimensionConversionUnits")
    public static Object[][] dimensionConversionUnits() {
        return new Object[][]{
                {"Length", "Inch"},
                {"Length", "Kilometer"},
                {"Length", "Fathom"},
                {"Length", "Micron"},
                {"Area", "Acre"},
                {"Volume", "Cup"},
        };
    }

    @DataProvider(name = "motionValues")
    public static Object[][] motionValues() {
        return new Object[][]{
                {"Speed", "Mile per hour", "Kilometer per hour", "2", "3.2187"},
                {"Acceleration", "Standard Gravity", "Galileo", "5", "4 903.325"}
        };
    }

    @DataProvider(name = "motionConversionUnits")
    public static Object[][] motionConversionUnits() {
        return new Object[][]{
                {"Speed", "Mile per hour"},
                {"Acceleration", "Standard Gravity"}
        };
    }

    @DataProvider(name = "leftMenuOptions")
    public static Object[][] leftMenuOptions() {
        return new Object[][]{
                {"Favorite conversions"},
                {"History"},
                {"My conversions"},
                {"Length"},
                {"Area"},
                {"Volume"},
                {"Currency"},
                {"Clothing and shoes"},
                {"Cooking"},
                {"Fuel consumption"},
                {"Time"},
                {"Pressure"},
                {"Weight"},
                {"Force"},
                {"Torque"},
                {"Speed"},
                {"Acceleration"},
                {"Angular speed"},
                {"Flow rate"},
                {"Density"},
                {"Dynamic viscosity"},
                {"Kinematic viscosity"},
                {"Mineralization"},
                {"Data storage"},
                {"Data transfer"},
                {"Energy"},
                {"Power"},
                {"Temperature"},
                {"Electric charge"},
                {"Electric current"},
                {"Electrical resistance"},
                {"Electric potential"},
                {"Electric capacitance"},
                {"Luminance"},
                {"Illuminance"},
                {"Radiation"},
                {"Radioactivity"},
                {"Magnetic field"},
                {"Angle"},
                {"Numbers"},
                {"Units and fractions"},
                {"Metrics"},
                {"Astronomy distance"}
        };
    }
}
