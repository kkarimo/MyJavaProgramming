package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number); // 100

        number = 200;

        System.out.println("number = " + number);

        String word = "Java Programming";

        System.out.println("word = " + word); // Java Programming

        word =  "Wooden Spoon";

        System.out.println("word = " + word); // Wooden Spoon

        System.out.println("----------------------------------------");

        //Addition Assignment

        int x = 100;

        System.out.println("x = " + x);

        x = x+200; // 300. short cut:  x+=200;

        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);

        num1 +=5.5; // very important
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;

        // deposit 300$ into this account
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------");

        //Subtraction Assignment

        //withdrawing 500$

        availableBalance -=500; // availableBalnce = 1300.5 - 500

        System.out.println("availableBalance = " + availableBalance);

        // withdrawing 200 $, then depositing 400$

        System.out.println("----------------------------------");

        availableBalance -= 200; // availableBalance = 600.50
        availableBalance += 400; // availableBalance = 1000.50

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------");

        // Multiplication Assignment

        double salary = 50000.50;
        salary*=2;

        System.out.println("salary = " + salary);

        double doge = 0.0000001;

        doge *= 10000000;
        System.out.println("dodge = " + doge);

        System.out.println("----------------------------------");

        // Division Assignment

        double num2 = 25000;

        num2 /= 2; // Or num2 = num2 / 2;

        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------");

        // Remainder Assignment

        double num3 = 100;

        // %=

        num3%=3; //new value of num3 will be 1

        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------");

        int amount = 127; // cents

        int quarter2 = amount/25;
        int cents = amount%25;

        System.out.println("quarter2 = " + quarter2);
        System.out.println("cents = " + cents);

        System.out.println("----------------------------------");
        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("----------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("----------------------------------");

        int balance = 3500;

        // insurance fee: 153$

        balance %= 153;
        System.out.println("balance = " + balance);







    }

}
