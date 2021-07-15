package section8.ArrayList;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int swap;
        int length = array.length;
        for(int i=0; i<length/2; i++){
            swap = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = swap;
        }
    }
}
