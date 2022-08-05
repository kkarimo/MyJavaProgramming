package day14_String.practice;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // implicit casting:
        int a = 100;
        double b = a; // OR double b = (double)a;

        System.out.println(a);
        System.out.println(b);

        // explicit casting:
        double x = 20.5;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);

        double dval = 32.33;
        int number = (int) dval;

        System.out.println(dval);
        System.out.println(number);


    }
}
