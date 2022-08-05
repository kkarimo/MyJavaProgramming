package week10;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        int i1 = 100; // primitive

        Integer i2; // object   Scanner scan = new Scanner...

        // auto-boxing Examples
        i2= i1; // automatically the data enlarge itself from primitive to Object
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(i1);// automatically the data enlarge itself from primitive to Object
        arrayList.add(i2);
        System.out.println("---Arraylist---");
        System.out.println("arrayList = " + arrayList);

        Integer n1 = 300;
        int n2 = n1; // un-boxing to primitive
        n2 = arrayList.get(1); // getting an Object from arrayList and assigning to primitive : un-boxing

        String searchResult = "1-48 of over 6,000 results for java";
    }
}
