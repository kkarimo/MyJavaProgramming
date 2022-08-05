package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {


        int num = 100;
        boolean result1 = num%2==0;
        boolean result2 = num%3==0;
        boolean result3 = num%5==0;

        System.out.println(num + " is divisible by 2: "+ result1);
        System.out.println(num + " is divisible by 3: "+ result2);
        System.out.println(num + " is divisible by 3: "+ result3);

    }


}
