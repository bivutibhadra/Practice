package exception_Handling;

public class Excetion5 {
    public static void main(String[] args) {

        try {
            int [] a = new int[4];
            a[4]=10;// Thise line is Exception

        } catch (ArithmeticException e) {               //Age sub class mane sub exception sue korte hobe
            System.out.println("Exception = " + e);
        } catch (ArrayIndexOutOfBoundsException e1) {                       // then pore main Excetion use korte hobe
            System.out.println("Exception = " + e1);
        } finally {
            System.out.println("List line of the program");

        }

    }
}
