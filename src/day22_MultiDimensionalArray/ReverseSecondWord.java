package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String arr [] = sentence.split(" ");

        System.out.println(Arrays.toString(arr));

        String result = "";

        for (int i = arr[1].length()-1; i >=0 ; i--) {
            char ch =arr[1].charAt(i);
            result += ch;
        }


            sentence = sentence.replaceFirst(arr[1], result);

        System.out.println(sentence);


    }
}

/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */