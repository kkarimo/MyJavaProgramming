package day37_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String colour) {
        super("Nokia", model, size, price, colour);
    }

    public void selfDefence(){
        System.out.println(brand + " " + model + " can be used for self defence tool");
    }

}
/*
1.4 Create a sub class of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()
 */