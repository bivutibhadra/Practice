
package statment;
import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {

                                                            //Java Bangla Tutorials 21 : Logical Operator

        Scanner vowelconsonent =new Scanner(System.in);
        char ch;
        System.out.print("Enter your word = ");

        ch = vowelconsonent.next().charAt(0);


        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

            System.out.print("vowel  "+ch);

        }else {

            System.out.print("consonent  ");

        }

    }
}


