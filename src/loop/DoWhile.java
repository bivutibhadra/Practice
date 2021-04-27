package loop;

import java.util.Scanner;

public class DoWhile {
                                                          /** useing a While loop*/
    public static void main(String[] args) {                  // 3 condition

        Scanner input1 = new Scanner(System.in);

        int x;

        System.out.print("Input Your multiplaing number: ");
        x = input1.nextInt();

        int i = 0;

        do{
            System.out.println(i+ x + " x " + i + " = " +( x * i));

            i++;

        }

        while(i<=10);


    }



}
