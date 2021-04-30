package methodOverride;

public class Teacher extends Person {
    String quali;

    @Override
    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Quali = "+quali);
        System.out.println(" ");


    }
}
