package day14_String.practice;

import java.util.Scanner;

public class NameFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String name = scan.nextLine();

        if (name.equals("Max Payne") || name.equals("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }


    }
}
