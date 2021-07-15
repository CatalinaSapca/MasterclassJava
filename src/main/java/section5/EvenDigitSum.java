package section5;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;

        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum = sum + digit;
            }
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(1));
        System.out.println(getEvenDigitSum(-3));
        System.out.println(getEvenDigitSum(890987));
    }


}
