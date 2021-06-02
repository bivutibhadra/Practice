package exception_Handling;

public class Exception2 {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x/y;        // Thise line is Exception

            System.out.println("Result = "+result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception = "+e);
        }
        finally{
            System.out.println("List line of the program");  //Final block use korla prothome vul takle oo final ta kaj korbe

        }

    }
}

