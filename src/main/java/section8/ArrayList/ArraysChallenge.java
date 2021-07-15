package section8.ArrayList;

import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static int[] sortIntegers(int[] array){
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
            copy[i] = array[i];

        boolean ok;
        int swap;
        do{
            ok = true;
            for(int i=0;i<copy.length-1;i++)
                if(copy[i]<copy[i+1]){
                    swap = copy[i];
                    copy[i] = copy[i+1];
                    copy[i+1] = swap;
                    ok = false;
                }
        }while(!ok);
        return copy;
    }

    public static int[] sortIntegers2(int[] array){
       int[] sortedArray = new int[array.length];
       for(int i=0;i<array.length; i++)
           sortedArray[i] = array[i];

       boolean flag = true;
       int temp;
       while(flag){
           flag = false;
           for(int i=0;i<sortedArray.length-1;i++)
               if(sortedArray[i] < sortedArray[i+1]){
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[i+1];
                   sortedArray[i+1] = temp;
                   flag = true;
               }
       }
       return sortedArray;

    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        printArray(values);
        printArray(sortIntegers(values));
    }


}
