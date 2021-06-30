package file;

import java.io.File;

public class Derictori {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Bivuti/OneDrive/Desktop/Test");

        dir.mkdir();
        String dire = dir.getAbsolutePath();
        System.out.println(dire);
        System.out.println(dir.getName());

        //if (dir.delete()) {
         //   System.out.println("folder is delete");

      //  }


    }
}
