package day36_Inheritance.animalTask;

public class Cat extends Animal{ // Cat is an Animal

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }

}
/*
    cat:
        6 variables
        (8 in total) 6 methods inherited from Animal class and plus 2 cats' own methods
 */