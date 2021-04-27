package statement;
import java.util.Scanner;
public class Namta {

    public static void main(String[] args)
    {
       Scanner namta = new Scanner(System.in);

        System.out.print("Enter your num = ");

      int x;
      x= namta.nextInt();

        for (int i =1;i<=100;i++)
        {
            //System.out.println("Namta");

            System.out.println( x+ "+" +i+"="+(x*i));

        }

    }

}
