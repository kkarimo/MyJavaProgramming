package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 13;
        int b = 6;

        int count = 0;

        for (int i = 0; i < a; i++) {
            a -=b;
            count++;

            if (a<b){
                break;
            }
        }

        System.out.println(count);

    }
}

/*
warmup tasks:
        1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

 */
