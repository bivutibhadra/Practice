package array;
public class Array2d2 {
    public static void main(String[] args) {
        int[][] number = new int[2][3];

        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

            for (int row = 0; row < number.length; ++row) {
            for (int clm = 0; clm < number[0].length; ++clm) {

                System.out.print("  " + number[row][clm]);
            }
            System.out.println();
        }
    }
}
