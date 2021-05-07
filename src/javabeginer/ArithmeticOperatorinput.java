
package javabeginer;

import java.util.Scanner;

public class ArithmeticOperatorinput {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int num1,num2,result;
             System.out.println("Enter first number= ");
             num1=input.nextInt();
             
              System.out.println("Enter second number= ");
             num2=input.nextInt();
             
     result=num1+num2;
        System.out.println("Equal="+result);
        
        result=num1-num2;
        System.out.println("Minise="+result);
        
        result=num1*num2;
        System.out.println("Entu="+result);
        
        double result2=(double) num1/num2;  // type custing korchi......
        System.out.println("dev="+result2);
        
        
        result=num1%num2;
        System.out.println("Veg ses="+result);
        
    }
    
}
