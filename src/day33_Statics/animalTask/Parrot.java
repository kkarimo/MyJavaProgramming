package day33_Statics.animalTask;

public class Parrot extends Animal {

    //public String parrotWingColour;

    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
        //this.parrotWingColour = parrotWingColour;
    }

    public void sing() {
        System.out.println(name + " is singing");
    }
}
