package day32_Constructors;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
/*
        if (isPersian){
            return (width*length)*unitPrice + 200;
        }else {
            return (width*length)*unitPrice;
        }

 */
        double totalPrice = (isPersian)? (width*length)*unitPrice + 200 : (width*length)*unitPrice;

        return totalPrice;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=$" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=$" + calcCost() +
                '}';
    }

    public static class ConstructorCalls {


        public ConstructorCalls(){
            System.out.println("Default Constructor");
        }

        public ConstructorCalls(int a){
            this(); // Default Constructor
            System.out.println("Constructor with int argument");
        }


        public ConstructorCalls(String str){
            this(10); //Default Constructor ,  Constructor with int argument
            System.out.println("Constructor with String argument");
        }


        public static void main(String[] args) {

            ConstructorCalls obj1 = new ConstructorCalls();

            System.out.println("----------------------------");

            ConstructorCalls obj2 = new ConstructorCalls(10);

            System.out.println("----------------------------");

            ConstructorCalls obj3= new ConstructorCalls("Java");


        }





    }
}
/*
5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

                instance methods:

                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including
                        the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */