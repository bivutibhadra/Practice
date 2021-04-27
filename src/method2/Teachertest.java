package method2;

public class Teachertest {
    public static void main(String[] args) {
        Teacher teacher1;            //Object declear
        teacher1 = new Teacher();      //Object Creat

        teacher1.setInformation("Bivuti","Male",1303244412);
        teacher1.displayInformation();


        Teacher teacher2;            //Object declear
        teacher2 = new Teacher();      //Object Creat

        teacher2.setInformation("Peu","Feaale",1303244413);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();   //object declaer and object creat
        teacher3.setInformation("xx","yy",1234);
        teacher3.displayInformation();

    }
}