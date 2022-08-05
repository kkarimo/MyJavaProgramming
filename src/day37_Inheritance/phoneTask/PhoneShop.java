package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        Samsung samsung = new Samsung("Galaxy s19", "6 inches", 900, "White");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.facetime(123456789);
        iphone.facetime("yahoo@gmail.com");

        System.out.println("------------------------------------");
        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();
        System.out.println("------------------------------------");
        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefence();

        System.out.println(iphone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Phone.hasBattery);
        System.out.println(nokia.hasBattery);
        System.out.println(Samsung.hasBattery);

    }
}
