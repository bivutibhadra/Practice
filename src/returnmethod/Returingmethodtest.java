package returnmethod;

public class Returingmethodtest {

   public static void main(String[] args) {
       Returningmethod ob1 = new Returningmethod();

       // int result = ob1.square(7);   ai vabe oo kora jai...basi efficent korte hoile

        System.out.println("Result = "+ob1.square(7));


       /**Returningmethod ob3 = new Returningmethod();
       int result2 = ob3.square(8);
       System.out.println("result="+result2);*/


       Returningmethod ob2 = new Returningmethod();
       System.out.println("Result = "+ob2.square(9));


    }
}