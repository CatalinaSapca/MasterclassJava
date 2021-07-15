package section3and4;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59)
            return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String time = "";
        if(hours < 10)
            time = time + "0" + hours + "h ";
        else
            time = time + hours + "h ";

        if(minutes < 10)
            time = time + "0" + minutes + "m ";
        else
            time = time + minutes + "m ";

        if(seconds < 10)
            time = time + "0" + seconds + "s ";
        else
            time = time + seconds + "s ";

        return time;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0)
            return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static void main(String[] args){
        System.out.println(getDurationString(123, 45));
        System.out.println(getDurationString(123));
    }
}
