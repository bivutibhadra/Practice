package polymorphism1;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.displayInformation();

        p = new Teacher();
        p.displayInformation();

        p = new Student();
        p.displayInformation();


    }
}
