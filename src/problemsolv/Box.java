package problemsolv;

public class Box {
    double hight,width,depth;

    Box (double h,double w,double d){

        hight = h;
        width = w;
        depth = d;
    }
    void displayVol(){
        double vol = hight * width * depth;
        System.out.println("Vol is="+vol);

    }

}
