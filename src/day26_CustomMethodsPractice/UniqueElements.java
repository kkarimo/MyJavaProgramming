package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 8};

        int[] unique = uniqueElement(array);

        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};

        double[] unique2 = uniqueElement(array2);

        System.out.println(Arrays.toString(unique2));

    }

    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {

                result = ArraysUtility.addElement(result, each);

            }
        }

        return result;

    }

    public static double[] uniqueElement(double[] array) {

        double[] result = {};

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {

                result = ArraysUtility.addElement(result, each);

            }
        }

        return result;

    }

    public static char[] uniqueElement(char[] array) {

        char[] result = {};

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {

                result = ArraysUtility.addElement(result, each);

            }
        }

        return result;

    }

    public static String[] uniqueElement(String[] array) {

        String[] result = {};

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {

                result = ArraysUtility.addElement(result, each);

            }
        }

        return result;

    }


}
