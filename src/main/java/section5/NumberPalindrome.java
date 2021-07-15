package section5;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        if(number < 0)
            number = Math.abs(number);

        int numberCopy = number;
        int palindrome = 0;

        while(numberCopy > 0){
            palindrome = palindrome*10 + numberCopy%10;
            numberCopy = numberCopy/10;
        }

        if(number == palindrome)
            return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-78987));
        System.out.println(isPalindrome(-56));
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(121));
    }
}

