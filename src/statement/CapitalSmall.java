package statement;

import java.util.Scanner;

public class CapitalSmall {

    public static void main(String[] args) {

        char ch;
        Scanner capsml = new Scanner(System.in);
                                                                       //Java Bangla Tutorials 22 : Logical Operator (part-2)
        System.out.print("Enter your key = ");
        ch = capsml.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.print("small latter ");

        }else if(ch>='A' && ch<='Z'){

            System.out.print("Capital latter ");

        }else {

            System.out.print("Not a latter ");

        }


    }
}
