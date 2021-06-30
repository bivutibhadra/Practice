package file;

import java.io.File;

public class FileCreat {
    public static void main(String[] args) {

        File dir = new File("C:/Users/Bivuti/OneDrive/Desktop/Test");
        dir.mkdir();

        File fle = new File("C:/Users/Bivuti/OneDrive/Desktop/Test/student.txt");
        File fle2 = new File("C:/Users/Bivuti/OneDrive/Desktop/Test/student2.txt");


        try {
            fle.createNewFile();
            fle2.createNewFile();


        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }
}
