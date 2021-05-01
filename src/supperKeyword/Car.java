package supperKeyword;

public class Car extends Vehical {
    int gare;

    Car(String c, double w, int g) {
        super(c, w);
        gare = g;
    }
    @Override
    void attribuit() {
        super.attribuit();
        System.out.println("Gear = " + gare);
        System.out.println("\n");


    }
}
