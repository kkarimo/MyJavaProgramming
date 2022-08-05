package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name:");
        String firstName = scan.next();

        System.out.println("enter last name:");
        String lastName = scan.next();

        scan.close();

        String first = firstName.substring(0,1).toUpperCase();
        String last = lastName.substring(0,1).toUpperCase();
        String restOfFirstName = firstName.substring(1).toLowerCase();
        String restOfLastName = lastName.substring(1).toLowerCase();

        System.out.println(first+restOfFirstName + " " + last+restOfLastName);

    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format
(first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */