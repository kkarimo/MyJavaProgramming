package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10+20); //30
        System.out.println(100-50); //50
        System.out.println(10*6); //60
        System.out.println(100.0/3);

        int a = 100;
        double b = a/6; //16
        double c = a/6.0; // 16.666666666666668 (another way: double b = a/6d; or another way: double b = (double) a/6;)

        System.out.println(b);
        System.out.println(c);



    }
}

/*
+: Addition
-: Subtraction
*: Multiplication
/: Division

in java:
10/4=2
10.0/4=2.5
100/3=33
%: Remainder
 */