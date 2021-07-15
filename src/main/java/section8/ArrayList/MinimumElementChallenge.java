package section8.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static int findMIn(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++)
            if(array[i] < min)
                min = array[i];
        return min;
    }

    private static int[] readIntegers(int number){
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void main(String[] args){
        System.out.println("Number of numbers to be read: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(number);
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum value from the array is: " + findMIn(array));
    }



}
