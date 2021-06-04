package problemSolve;

import java.util.Scanner;

public class SolvException2 {
    public static void main(String[] args) {


        int count = 1;           //question solve
        do {

            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1 : ");
                int num1 = input.nextInt();

                System.out.print("Please enter num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result :" + num1 + "/" + num2 + "=" + result);
                count = 2;
            } catch (Exception e) {

                System.out.println("Exception :" + e);
                System.out.println("You much enter integer.Please try again....");

            }
        } while (count == 1);


    }


}
