package staticskeyword;

public class Student {
    String name;    //class variable
    int id;         //class variable
    static String university = "diu";  //static variable
    Student(String n,int m){
        name = n;
        id = m;
    }
    void displayInformation(){

        System.out.println("Student name = "+name);
        System.out.println("Id name = "+id);
        System.out.println("University name = "+university);
        System.out.println("\n");


    }
}
