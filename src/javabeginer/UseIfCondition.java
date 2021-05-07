
package javabeginer;

import java.util.Scanner;

public class UseIfCondition {
    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
             int num;
             System.out.println("Enter your any int number= ");
             num=input.nextInt();
             if(num>0){
                 System.out.println("positive");
    }
             
             else if(num<0){
                              System.out.println("negative");

             }
             
             else{
                              System.out.println("zero");

             }
}
    
}
