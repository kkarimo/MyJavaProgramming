package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println(reversedList);
    }
}
