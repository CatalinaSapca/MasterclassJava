package section5;

public class ForStatement {

    public static void main(String[] args){
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000, 4));

        for(int i = 2; i<=4; i++)
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, 4));

        sum3and5();
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

    private static boolean isPrime(int number){
        if(number == 1 || number %2 == 0)
            return false;
        for(int i = 3; i*i <= number; i = i+2)
            if(number % i == 0)
                return false;
        return true;
    }

    private static void sum3and5 (){
        int sum = 0;
        int counter = 0;
        for(int i = 1; i<=1000; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                System.out.println(i);
                counter ++;
            }
            if(counter == 5)
                break;
        }
    }


}
