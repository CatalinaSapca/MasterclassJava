package section3and4;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        return ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23)) && isBarking;
    }
}

