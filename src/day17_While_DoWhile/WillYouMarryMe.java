package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? yes/no");
        String answer = scan.next();
        while ( !( answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
            System.err.println("Invalid answer, please re-enter:");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats!");
        }else {
            System.out.println("Goodbye");
        }




    }
}
