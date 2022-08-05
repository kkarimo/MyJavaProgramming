package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};

        arr1 = reverse(arr1);

        System.out.println(Arrays.toString(arr1));

    }

    public static int[] reverse (int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }


        return result;

    }

}
