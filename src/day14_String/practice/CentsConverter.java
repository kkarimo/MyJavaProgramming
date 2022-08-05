package day14_String.practice;

import java.util.Scanner;

public class CentsConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        scan.close();

        int quarter = cents/25;
        int dime = (cents%25)/10;
        int nickels = quarter/5;
        int pennies = cents %5;

        System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, "+nickels+" nickels, and "+pennies+" pennies");




    }
}
