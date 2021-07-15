package section5;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int min;
        int max;
        System.out.println("Enter number: ");
        if(scanner.hasNextInt()){
           min = scanner.nextInt();
           max = scanner.nextInt();
        }
        else {
            System.out.println("Could not determine mix and max. Not enough data.");
            return;
        }
        while(true){
            System.out.println("Enter number: ");
            if(scanner.hasNextInt()){
                int num = scanner.nextInt();
                if(num > max)
                    max = num;
                if(num < min)
                    min = num;
            }
            else {
                System.out.println("Invalid number.");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("min =  " + min);
        System.out.println("max =  " + max);
    }
}
