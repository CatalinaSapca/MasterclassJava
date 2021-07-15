package section3and4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return  -1;
        else{
            long milesPerHour = (long) (kilometersPerHour / 1.609d);
            return Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " kilometers per hour equal " + toMilesPerHour(kilometersPerHour) + " miles per hour.");
    }
}
