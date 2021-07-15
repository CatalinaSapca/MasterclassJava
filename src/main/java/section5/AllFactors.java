package section5;

public class AllFactors {

    public static void printFactors(int number){
        if(number < 1)
            System.out.println("Invalid Value");

        for(int i =1 ;i<=number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        printFactors(12);
        printFactors(-12);
        printFactors(5);
        printFactors(52);
        printFactors(524);
    }

}
