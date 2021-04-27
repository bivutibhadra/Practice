package statement;

import java.util.Scanner;

public class StatementCondition {
    public static void main(String[] args) {

        Scanner InputStatement = new Scanner(System.in);
        System.out.print("Enter your number = ");

        int num;
        num = InputStatement.nextInt();

        if(num> 0){
            System.out.println("Positive = "+num);

        }else if (num>=0){

            System.out.println("Equal = "+num);
        }else{

            System.out.println(" Negative = "+num);

        }



    }

}
