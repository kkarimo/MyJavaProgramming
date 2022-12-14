package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo")  && p.equals("Cydeo123") ){ // if credentials are valid

            System.out.println("Logged in");

        }else{ // if credentials are not valid
            int attempts = 3; //3, 2, 1

            for (int i = 0; i < attempts; i++){ // while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;

                if ( u.equals("Cydeo")  && p.equals("Cydeo123") ){
                    System.out.println("Logged in");
                    break;
                }

            }

            if(u.equals("Cydeo")  && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.err.println("Your account is locked.");
            }

        }

        scan.close();


    }
}
