package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNum = input.next();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your post code");
        String postCode = input.nextLine();

        System.out.println(fullName + "\n" + buildingNum + " " + streetName + "\n" + cityName + "\n" + state + " " + postCode);

        input.close();

    }
}

/*
1. Enter your full name
2. Enter your building number
3. Enter your street name
4. Enter your city name
5. Enter your state
6. Enter your post code

Display the shipping address
 */