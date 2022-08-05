package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Khurshid Karimov",
                buildingNumber = "16",
                streetName = "Grangeway",
                townName = "Houghton Regis",
                city = "Dunstable",
                postCode = "LU5 5PR";

        //System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+townName+"\n"+city+" "+postCode);
        String address = name+"\n"+buildingNumber+" "+streetName+"\n"+townName+"\n"+city+" "+postCode;
        System.out.println(address);
    }
}
