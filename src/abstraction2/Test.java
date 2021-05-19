package abstraction2;

public class Test {
    public static void main(String[] args) {
        Shape shp;
        shp = new Rectangle(5,8);
        shp.area();
        shp = new Tringle(5,7);
        shp.area();
        shp = new Circle(7);
        shp.area();

    }
}
