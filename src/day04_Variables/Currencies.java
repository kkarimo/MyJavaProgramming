package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;
        double lira = dollar * 15.10;
        double euro = dollar * 0.95;
        double gbp =  dollar * 0.81;
        double cad = dollar * 1.30;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("gbp = " + gbp);
        System.out.println("cad = " + cad);
    }
}
