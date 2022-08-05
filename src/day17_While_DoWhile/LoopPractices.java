package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------------");

        int i = 1;
        while (i < 11){
            System.out.println(i);
            i++;
        }

        System.out.println("-------------------------");

        int ini = 1;
        do {
            System.out.println(ini);
            ini++;
        }while (ini<=10);


    }
}
