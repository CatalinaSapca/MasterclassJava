package section5;

public class DigitSumChallenge {

    public static void main(String[] args){
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number){
        if(number < 10)
            return -1;
        int sum = 0;
        while(number != 0){
           sum = sum + number%10;
           number = number/10;
        }
        return sum;
    }

}
