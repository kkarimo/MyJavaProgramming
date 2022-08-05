package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Khurshid", 'M', 38);

        Person person2 = new Person("Kseniia",'F', 28);
        person2.age = 30;

        System.out.println(person1);
        System.out.println(person2);

    }

}
