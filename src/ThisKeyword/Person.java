package ThisKeyword;

public class Person {
    String name;
    int age;
    String haircolour;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Person(String name, int age, String haircolour) {
        this(name, age);
        this.haircolour = haircolour;
    }


    void displayInformation() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Here colour = " + haircolour);
        System.out.println("\n");


    }
}
