package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your first name");
        String lastName = scan.next();

        scan.close();

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        System.out.println(ch1+"."+ch2);

    }
}
