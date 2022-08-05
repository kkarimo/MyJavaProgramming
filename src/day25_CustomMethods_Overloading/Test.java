package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "JAva programming Language";
        StringUtility.printEachChar(str);

        System.out.println("---------------------------");

        String s1 = "Wooden Spoon";

        s1 = StringUtility.reverse(s1);
        System.out.println(s1);

        String word = "Java";
        System.out.println("---------------------------");
        boolean palindrome  = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("---------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;
        for (String each : names) {

            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }

        System.out.println("count = " + count);

        System.out.println("---------------------------");

        String str1 = "Silent";
        String str2 = "listen";

        System.out.println( StringUtility.anagram(str1,str2) );

        System.out.println("---------------------------");

        String removed = StringUtility.removeDuplicates("aaabbbbcccccd");

        System.out.println("removed = " + removed);

    }


}
