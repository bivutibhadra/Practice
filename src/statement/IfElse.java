package statement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner ifelse = new Scanner(System.in);
        char ch;
        System.out.print("Enter your charecter = ");

        ch = ifelse.next().charAt(0);
        if (ch == 'A') {
            System.out.println( ch+ " is vowel ");

        } else if (ch == 'E') {
            System.out.println(ch +" is vowel ");

        } else if (ch == 'I') {
            System.out.println( ch+"  is vowel " );

        } else if (ch == 'O') {
            System.out.println(ch+" is vowel ");

        } else if (ch == 'U') {
            System.out.println(ch +" is vowel");
        } else {
            System.out.println(ch+ " is consonent");

        }
    }
}