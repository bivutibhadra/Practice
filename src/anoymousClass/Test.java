package anoymousClass;

public class Test {
    public static void main(String[] args) {
        Person p = new Person() {

            @Override
            void display() {

                System.out.println("i am teacher");
            }

        };
        p.display();
    }
}
