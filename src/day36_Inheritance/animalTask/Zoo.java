package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 2, "White");

        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();
        // dog.hunt();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', "Small", 3, "brown");

        cat.eat();
        cat.drink();
        dog.move();
        cat.sleep();
        // cat.bark();
        // cat.hunt();
        cat.scratch();
        System.out.println(cat);
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "Large", 4, "Red");

        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();
        tiger.roar();
        tiger.hunt();
        //tiger.bark();
        System.out.println(tiger);

    }
}
