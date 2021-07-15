package section5;

public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number < 0)
            return -1;

        int largestPrime = -1;
        for(int i = 2; i<= number; i++){
            boolean isPrime = true;
            for(int j = 2; j*j<=i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(number % i == 0 && isPrime)
                largestPrime = i;
        }
        return largestPrime;
    }

    public static void main(String[] args){
        System.out.println(getLargestPrime(90));
        System.out.println(getLargestPrime(79));
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(100));
    }

}
