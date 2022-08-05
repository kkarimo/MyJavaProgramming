package day08_IfStatement;

public class SwapTwoVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        
        b = a;
        a = b + 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }

}

/*
1. write a program that can swap two variables' value WITHOUT using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */