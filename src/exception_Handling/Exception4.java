package exception_Handling;

public class Exception4 {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;        // Thise line is Exception

            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {               //Age sub class mane sub exception sue korte hobe
            System.out.println("Exception = " + e);
        } catch (Exception e1) {                       // then pore main Excetion use korte hobe
            System.out.println("Exception = " + e1);
        } finally {
            System.out.println("List line of the program");

        }

    }
}
