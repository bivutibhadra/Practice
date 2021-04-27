package array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        System.out.print("Enter your number = " );

        double [] Num = new double[5];

        for (int i =0 ;i<Num.length; i++){
            Num[i]= input.nextDouble();
        }
        for (int i=0;i<Num.length;i++){
            sum = sum+Num[i];
        }
        System.out.println("Your Answer = "+sum);

        double avg = sum / Num.length;
        System.out.println("Your Average Answer = "+avg);

    }
}
