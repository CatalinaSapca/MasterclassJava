package section3and4;

public class DecimComp {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        number1 = number1 * 1000;
        number2 = number2 * 1000;
        return ( (int)number1 == (int)number2 );
    }
}
