package day04_Variables;

public class PrimitivesIntro {


    public static void main(String[] args) {


        //age: 38 years old

        byte age = 38;

        //weight: 160 pounds.

       // byte weight = 160; //160 is out of byte's range

        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        //short salary = 100000; //100000 is out of the short's range

        int salary = 100_000; // is preferred data type for integer numbers. Only "_" can be used in large numbers


        long assett = 3_333_333_333L;

        //tax: 0.26

        float tax = 0.26F;

        double PI = 3.2;

        //#
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 65535;

        System.out.println("ch4 = " + ch4);

        char grade = 'F';
        System.out.println("grade = " + grade);

        char gender = 'M';

        System.out.println("gender = " + gender);

        boolean isEmployed=true;
        boolean isMarried=false;

        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";


        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);






    }
}
