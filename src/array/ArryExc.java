package array;

public class ArryExc {
    public static void main(String[] args) {
        
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        int sum;
        sum = num[0] + num[1] + num[2];
        System.out.println("ans = " + sum);

        int avg;
        avg = sum/3;
        System.out.println("avg = "+avg);
    }
}
