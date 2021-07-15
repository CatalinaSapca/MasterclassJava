package section8.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++)
            sum = sum + array[i];
        return sum/array.length;
    }

    public static void main2(String[] args) {
        //int[] myIntArray = new int[10];
        int[] myIntArray = {1,2,3,4,5,6,7,7,8,10};
//        myIntArray[5] = 50;
//        myIntArray[0] = 9;
//        myIntArray[1] = 10;
        for(int i=0;i<myIntArray.length;i++)
            System.out.println(myIntArray[i]);
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

        //------------
        int[] values = getIntegers(5);
        for(int i=0;i<values.length;i++)
            System.out.println(values[i]);
        System.out.println("The average of these numbers is " + getAverage(values));
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args) {
        //---------------------
       int myValue = 20;
       int mySecondValue = myValue;

        System.out.println("myValue is " + myValue);
        System.out.println("mySecondValue is " + mySecondValue);

        mySecondValue++;

        System.out.println("myValue is " + myValue);
        System.out.println("mySecondValue is " + mySecondValue);

        //-------------
        int[] myArray = new int[5];
        int [] anotherArray = myArray;
        //both arrays point to the same memory block
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8}; //dereferencing
        modifyArray(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
   }

   public static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5}; //dereferencing
   }





}
