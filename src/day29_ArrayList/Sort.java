package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,2,10,4,13,6,2, 7 ,8, 8));
        Collections.swap(list, 0,list.size()-1);
        System.out.println(list);

    }
}
