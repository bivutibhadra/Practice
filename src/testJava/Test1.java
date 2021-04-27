package testJava;

public class Test1 {
    public static void main(String[] args) {

        //A 12*8 grid, in [row][colum]

        int myArray[][] = new int[12][8];
        int numRows = myArray.length;
        int numCols = myArray[0].length;

        //Fill the Array

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++){
                myArray[row][col]=row * numCols+col+1;
            }
        }

        //Print the Array

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.printf("%3d", myArray[row][col]);
            }
            System.out.println();
        }

    }
}



