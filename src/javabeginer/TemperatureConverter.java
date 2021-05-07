
package javabeginer;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
       double cels,farn;
        System.out.print("Celsius=");
        cels = input.nextDouble();
        farn=1.6*cels+32;
        System.out.println("Farenheat= "+farn);
    }
}
