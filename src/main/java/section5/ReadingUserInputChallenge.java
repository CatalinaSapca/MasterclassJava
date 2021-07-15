package section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int sum = 0;
        int count = 0;
        while(count<10){
            if(scanner.hasNextInt()){
                sum = sum + scanner.nextInt();
                count++;
            }
            else
                System.out.println("Invalid number.");

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum is " + sum);
    }


}
