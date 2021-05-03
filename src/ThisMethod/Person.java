package ThisMethod;

public class Person {
    void displayInformation() {
        System.out.println("Hello i am this metthod");
    }

    void displayInformation2() {
        this.displayInformation();
        System.out.println("I am just metthod");

    }
}

