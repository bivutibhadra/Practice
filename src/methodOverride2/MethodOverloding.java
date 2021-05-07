package methodOverride2;

public class MethodOverloding {

    void displayMethod(int x, int y){

        int z = x+y;
        System.out.println(+z);

    }

    void displayMethod(int a, int b, int c){
        int d = a+b+c;
        System.out.println(+d);
    }
    void displayMethod(double m, double n){
            double q = m+n;
            System.out.println(+q);

    }

    void displayMethod(){

        System.out.println("Thank You");
    }

    }

