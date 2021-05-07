
package javabeginer;

import java.util.Scanner;


public class TemperatureConverter2 {
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
       double farn,cels;
        System.out.print("farnheat= ");
        farn = input.nextDouble();
        cels= 0.5555555556 * farn-32;
        System.out.println("Sealus= "+cels);
    }
}


