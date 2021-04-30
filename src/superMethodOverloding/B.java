package superMethodOverloding;

public class B extends A {
    //int x = 5;

    @Override
    void displayInformation(){
       super.displayInformation();
        System.out.println("AND");
        System.out.println("Inside B class");

    }
}
