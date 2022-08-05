package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {


        String word = "Levell";

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            result += ch;
        }

        boolean Palindrome = word.equalsIgnoreCase(result);

        if (Palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
