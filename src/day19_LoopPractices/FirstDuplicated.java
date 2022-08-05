package day19_LoopPractices;

public class FirstDuplicated {

    public static void main(String[] args) {

        String str = "abccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch==each){
                    count++;
                }
            }

            if (count>1){
                result +=ch;
                break;
            }

        }

        System.out.println(result);



    }
}

/*
1. Write a program that can return the first duplicated character from a string
 */