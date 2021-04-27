package inputusers;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        int num;
        Scanner inputdata = new Scanner(System.in);

        System.out.print("Enter your key = ");
        num = inputdata.nextInt();
        System.out.println("Answer = "+num);
    }
}
