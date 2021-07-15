package section5;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c))
            return false;

        int count = 0;
        if(a%10 == b%10 || a%10 == c%10 || b%10 == c%10)
           return true;
        return false;
    }


    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

}
