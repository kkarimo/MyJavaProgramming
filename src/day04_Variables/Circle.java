package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double radius = 10;
        double pi = 3.14;
        double area = pi * radius * radius;
        double diameter = 2*radius;
        double perimeter = diameter*pi;

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);

    }
}
