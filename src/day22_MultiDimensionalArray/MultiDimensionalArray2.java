package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = { {1,2,3},{4,5,6},{7,8,9}  };

        // 3 dimensional array contains 2 d arrays

        //                      0         1        2            0             1           2
        int[][][] arr3D = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };
        //                            0                                     1

        //[index num of 2DArray][index num of 1D Array][index number of elements]

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString( arr3D[1][1] ) );
        System.out.println( arr3D[0][2][2] );

        for (int[][] each1 : arr3D) {
            for (int[] each2 : each1) {
                for (int each3 : each2) {
                    System.out.print(each3 + " ");
                }
            }
        }

        System.out.println("-----------------------------------------");

        int[][][][] arr4D = {   {{{1,2,3}, {4,5,6}, {7,8,9}} ,{{10,20,30}, {40,50,60}, {70,80,90}}}, {{{100,200,300}, {400,500,600}, {700,800,900}} ,{{1000,2000,3000}, {4000,5000,6000}, {7000,8000,9000}}}   };

        for (int[][][] each1 : arr4D) {
            for (int[][] each2 : each1) {
                for (int[] each3 : each2) {
                    for (int each4 : each3) {
                        System.out.print( each4 + " ");
                    }
                }
            }
        }


    }
}
