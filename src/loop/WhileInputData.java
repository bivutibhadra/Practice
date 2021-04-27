// Java While Loop example

package loop;

import java.util.Scanner;

public class WhileInputData {

    public static void main(String[] args) {

        Scanner lop = new Scanner(System.in);
        int i = 0 ;
        int x;
        System.out.print("Enter your number = ");
        x = lop.nextInt();

        while(i!=5){

            System.out.println(i+" Hello word = "+i);
            i++;

        }

    }
}