package inheritence;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
       // Scanner inputdata = Scanner(System.in);

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();


        System.out.print("Enter your Name = ");
        t1.name= inputdata.next();

        System.out.print("Enter your Age = ");
        t1.age = inputdata.nextInt();

        System.out.print("Enter your Qua = ");
        t1.quali = inputdata.next();
        System.out.println(" ");

        t1.displayInformation2();


        System.out.println("  ");

        //Teachers 2

        System.out.print("Enter your Name = ");
        t2.name= inputdata.next();

        System.out.print("Enter your Age = ");
        t2.age = inputdata.nextInt();

        System.out.print("Enter your Qua = ");
        t2.quali = inputdata.next();
        System.out.println(" ");


        t2.displayInformation2();

    }

}

