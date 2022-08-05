package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public  Iphone ( String model, String size, double price, String colour){
        super("Apple", model, size, price, colour);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand + " " + model + " is having a Face Time with phone number " + phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email" + email);
    }


}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */