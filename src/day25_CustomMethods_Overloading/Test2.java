package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};

       ArraysUtility.printEachElement(arr2);

        System.out.println("------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D', 'E'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------------------");

        String[] arr4 = {"David", "Elvira", "Ali", "Igor", "Yusuf"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("------------------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean res = ArraysUtility.contains(a1,8);

        System.out.println("res = " + res);

    }
}
