package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

    Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);

        System.out.println(square);

        System.out.println("-----------------------------------------");

       Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);


    }
}
