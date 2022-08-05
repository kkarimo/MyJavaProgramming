package day14_String.practice;

public class UnaryOperators {

    public static void main(String[] args) {

        //Positive & Negative
        int a = -100;
        int b = +200;

        boolean aIsNegative = a<0;
        boolean bIsPositive = b >0;

        System.out.println(aIsNegative);
        System.out.println(bIsPositive);
        //Increment & Decrement
        int x = 10;
        System.out.println(++x);//11
        System.out.println(--x);//10 (11-1) decrements the value by 1 based on the last value which was 11 not 10

        int z = 20;
        System.out.println(z++);//20
        System.out.println(z);//21

        int y = 15;
        System.out.println(y--);//15
        System.out.println(y);//14

        /*
        Pre Increment/Decrement increases or decreases the value by 1 immediately
        Post Increment/Decrement - Old value of the variable will be used first before Increases/decreases the value by 1 in the
memory
         */



    }
}
