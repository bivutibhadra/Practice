package bookExmple;

public class DrawingBord {
    public void draw(Shape shape) {
        System.out.println("Drawing a Shape : "+shape.getName());

        String typeName = shape.getClass().getTypeName();
        String superClassType = shape.getClass().getSuperclass().getTypeName();
        System.out.println("TypeName: "+typeName);
        System.out.println("SuperClass Type : "+superClassType);
    }
}
