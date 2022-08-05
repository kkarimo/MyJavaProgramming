package day14_String.practice;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(1000+2000);
        System.out.println(2.5+3.5);

        System.out.println(100-30);
        int a= 300-100;
        System.out.println(a);

        System.out.println(20*6);
        System.out.println(5.5*7);

        System.out.println(10/4); //2
        System.out.println(10/4.0);//2.5
        System.out.println(10/4d);//2.5

        System.out.println(10%4); // remainder is 2

        System.out.println(20%5); //0
        System.out.println(20%6); //2

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

In math: 10/4 = 2.5
remainder: numerator - (denominator * integer result)
10 - (4*2)=2
 */