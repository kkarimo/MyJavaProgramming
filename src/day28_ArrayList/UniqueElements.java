package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();//{10,20}

        for (Integer each : list) {
            if (result.equals(each)){
                continue;
            }
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }



        System.out.println(result);
    }

}