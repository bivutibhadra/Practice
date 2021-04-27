package array;

import java.util.Scanner;

public class Arry2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your five number = ");
        double sum = 0;

        double[] Number = new double[5];

        Number[0] = input.nextDouble();
        Number[1] = input.nextDouble();
        Number[2] = input.nextDouble();
        Number[3] = input.nextDouble();
        Number[4] = input.nextDouble();

        sum = Number[0] + Number[1] + Number[2] + Number[3] + Number[4];
        System.out.println("Answer = " + sum);

    }
}
