package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ItemName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];

        int[] prices = new int[5];

        int totalPrice = 0;

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter the item name:");
            items[i] = scan.next();
            System.out.println(items[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter the price:");
            prices[i] = scan.nextInt();
            totalPrice += prices[i];
        }


        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println("Total price = " + totalPrice);


    }
}

/*
		1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */