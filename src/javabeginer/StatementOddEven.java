
package javabeginer;

import java.util.Scanner;

public class StatementOddEven {
    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
int num;
        System.out.print("input your number= ");
        num=input.nextInt();
        
        if(num%2==0) {
                System.out.println("Even");
        }
       else{
                System.out.println("Odd");
                }
        
    }
}
