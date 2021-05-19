package abstraction2;

public class Tringle extends Shape {

    Tringle (double dim1, double dim2) {
        super(dim1,dim2);
    }

    @Override
    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Tringle = " +result);
    }
}

