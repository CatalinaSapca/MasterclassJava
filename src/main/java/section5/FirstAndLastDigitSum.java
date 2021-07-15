package section5;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return  -1;

        int sum = number % 10;

        while (number > 9){
            number /= 10;
        }

        sum = sum + number;
        return sum;
    }

    public static void main(String[] args){
        System.out.println("First+last digit for 1234 = " + sumFirstAndLastDigit(1234));
        System.out.println("First+last digit for -67 = " + sumFirstAndLastDigit(-67));
        System.out.println("First+last digit for 0 = " + sumFirstAndLastDigit(0));
    }

}
