package polymorphism2;

public class Tringle extends Shape {

    double base,height;

    Tringle (double base,double height){

        this.base = base;
        this.height= height;
    }
    @Override
    double area(){
        System.out.print("Tringle = ");
        return 0.5 * base * height;


    }
}
