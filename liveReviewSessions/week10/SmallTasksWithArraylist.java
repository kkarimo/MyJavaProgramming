package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallTasksWithArraylist {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        numbers.set( numbers.size()-1, 0 );

        System.out.println(numbers);

        System.out.println("------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int tem = list.get(0);
        list.set( list.size()-1,  list.get(0));
        list.add( tem );
        System.out.println(list);

    }

}

/*
1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
 */