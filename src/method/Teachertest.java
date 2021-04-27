package method;

public class Teachertest {
    public static void main(String[] args) {
        Teacher teacher1;            //Object declear
        teacher1 = new Teacher();      //Object Creat

        teacher1.name = "Bivuti";
        teacher1.gender = "Male";
        teacher1.phone = 1303244412;

        Teacher teacher2;            //Object declear
        teacher2 = new Teacher();      //Object Creat

        teacher2.name = "Peu ";
        teacher2.gender = "Female";
        teacher2.phone = 1947412909;

        System.out.println("Name = " +teacher1.name);
        System.out.println("Name = " +teacher1.gender);
        System.out.println("Name = " +teacher1.phone);
        System.out.println("\n");



        System.out.println("Name = " +teacher2.name);
        System.out.println("Name = " +teacher2.gender);
        System.out.println("Name = " +teacher2.phone);

    }
}
