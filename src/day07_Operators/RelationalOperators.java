package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //>, >=, <, <=. Can only be applied for the numerical conditions. These cannot be applied for string

        boolean result1 = 200>40; // true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;// true

        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;// if the credit score is 720 or greater then it's eligible for the loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120;

        System.out.println("result5 = " + result5);

        boolean result6 = 200 <180;

        System.out.println("result6 = " + result6);

        int score = 75;

        boolean hasFailed = score <=59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45<=60;

        System.out.println("result7 = " + result7);

        System.out.println("----------------------------------------------");

        // ==, != can be used for char, int, String

        int x = 100;
        int y = 200;

        boolean result8 = x==y;

        System.out.println("result8 = " + result8);
        System.out.println("Adam"=="Adam"); // true

        boolean result9 = 'A'=='a'; // from ASCII table.

        System.out.println("result9 = " + result9);

        boolean result10 = "Java"=="Java";
        System.out.println("result10 = " + result10);

        System.out.println("----------------------------------------------");

        boolean result11 = 100!=200; // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java"!="Break"; // true

        System.out.println("result12 = " + result12);

        boolean result13 = 300!=300; // false

        System.out.println("result13 = " + result13);









    }
}
