package section5;

public class SumOdd {

    public static boolean isOdd(int number){
        return (number > 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        if(end < start || start <= 0 || end <= 0)
            return -1;

        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i))
                sum = sum + i;
        }
        return sum;
    }


}
