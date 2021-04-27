package array;

import java.util.Scanner;

public class ArryMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first key = ");
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        //Getting a user input
            for (int row = 0; row < 2 ; row++) {
                for (int clm = 0; clm < 3; clm++) {
                    System.out.printf("a[%d][%d]= ",row,clm);
                    a [row][clm] = input.nextInt();
                }
        }
        //Getting b user input
        System.out.println("Enter your second key = ");
        for (int row = 0; row < 2 ; row++) {
            for (int clm = 0; clm < 3; clm++) {
                System.out.printf("b[%d][%d] = ",row,clm);

                b [row][clm] = input.nextInt();
            }
        }

        //Printing a matrix
        System.out.print("A =");
        for (int row = 0; row < 2 ; row++) {
            for (int clm = 0; clm < 3; clm++) {

                System.out.print(" " + a[row][clm]);

            }
            System.out.println();
        }

        //for b


        //Printing a matrix
         System.out.println("B =");
        for (int row = 0; row < 2 ; row++) {
            for (int clm = 0; clm < 3; clm++) {

                System.out.print(" " + b[row][clm]);

            }
            System.out.println();
        }

    }

}
