package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 50;
        char Grade;

        if (score >= 90) {
            Grade = 'A';
        } else if (score >= 80) {
            Grade = 'B';
        } else if (score >= 70) {
            Grade = 'C';
        } else if (score >= 60) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }
        System.out.println("Grade = " + Grade);

    }
}


/*
1. garde report ==> A, B, C, D, F
 */