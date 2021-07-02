package writFile;

import java.util.Formatter;

public class WritDemo {
    public static void main(String[] args) {


        try {
            Formatter forrmmiting = new Formatter("C:/Users/Bivuti/OneDrive/Desktop/Test/student.txt");
            forrmmiting.format("%s %s \r\n", "101", "Bivuti");
            forrmmiting.format("%s %s \r\n", "102", "Bappi");
            forrmmiting.format("%s %s \r\n", "103", "shailon");

            forrmmiting.close();

        }catch(Exception e){

            System.out.println(e);

        }

    }
}
