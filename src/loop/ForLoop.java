package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner lop = new Scanner(System.in);
        Scanner lop1 = new Scanner(System.in);

        int a;
        String b = "";

        System.out.print("Number = ");
        a = lop.nextInt();

        System.out.print("Name = ");

        b = lop1.next();

        for (int j = 1; j <= 5; j++) {              //condition 3 ta

            System.out.println(j + " Your key  =  " + a + b);
            System.out.println(j + " Your key  =  " + b);


        }
    }

}
