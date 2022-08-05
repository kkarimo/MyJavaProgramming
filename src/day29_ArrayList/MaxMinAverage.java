
package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (Integer each : list) {
            if ( each> max ){
                max = each;
            }

            if (each<min){
                min = each;
            }

            sum += each;

        }
        double average = sum/list.size();

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);

    }
}
/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
 */