package exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x/y;        // Thise line is Exception

            System.out.println("Result = "+result);
        }catch(ArithmeticException e){
            System.out.println("Exception = "+e);
        }

        System.out.println("List line of the program");
    }
}
