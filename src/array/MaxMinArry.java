package array;

import java.util.Scanner;

public class MaxMinArry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        System.out.print("Enter your number = ");

        double[] Num = new double[5];

        for (int i = 0; i < Num.length; i++) {
            Num[i] = input.nextDouble();
        }
        for (int i = 0; i < Num.length; i++) {
            sum = sum + Num[i];
        }
        double avg = sum / Num.length;
        System.out.println("Your Average Answer = " + avg);
        System.out.println("Your Answer = " + sum);

        double max = Num[0];
        double min = Num[0];

        for (int i = 1; i < 5; i++) {

            if (max < Num[i]) {
                max = Num[i];
            }

            if (min > Num[i]) {
                min = Num[i];
            }
        }
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);


    }

}
