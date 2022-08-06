package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String colour, int miles) {
        super("Toyota", model, year, price, colour, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is a reliable car");
    }

    public void start(){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }


}
/*
1. Toyota:
					extra methods:
							reliable()
 */