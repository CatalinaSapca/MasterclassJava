package section3and4;

public class Overloading2 {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if( feet < 0 || inches < 0 || inches > 12)
            return -1;
        double centimeters = (int) ((inches + (feet * 12) ) * 2.54);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches < 0)
            return -1;
        double feet = inches / 24;
        double remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
