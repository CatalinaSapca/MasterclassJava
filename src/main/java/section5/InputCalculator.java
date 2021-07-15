package section5;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            if(!scanner.hasNextInt())
                break;
            else{
                int number = scanner.nextInt();
                scanner.nextLine();

                sum = sum + number;
                count++;
            }
        }

        long avg = 0;
        if(count != 0)
            avg = Math.round(((double)sum)/count);


        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}

