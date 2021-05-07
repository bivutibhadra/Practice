package polymorphism3;

public class Test {
    public static void main(String[] args) {


        /** ata ee hoscha main run time polymorphisam
         * ba dynamic method dispas
         */


        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10,20);
        Shape s3 = new Tringle(10,20);


        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}
