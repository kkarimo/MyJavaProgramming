package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        int c = b;
            // int c = (int)b

        long d = (long) c;
        float e = d;
        double f = e;

        int x = 55;
        short y = (byte) x; //explicit casting
        System.out.println("-----------");

        System.out.println(x + ":" + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+":"+k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l+":"+m);

        double n = 10.8;
        int o = (int) n;

        System.out.println(n+":"+o);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1+":"+s1);

        float f1 = 30.5F;
        long l1 = (long) f1;



    }
}
