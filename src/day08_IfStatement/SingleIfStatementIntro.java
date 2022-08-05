package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {


        int number = 302;

        boolean evenNumber = number%2==0;

        if (evenNumber){
            System.out.println(number+" is Even Number");
        }

        if (!evenNumber) {
            System.out.println(number + " is Odd Number");
        }






    }
}
