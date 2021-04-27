package methodconstructor;

//Using constor method
//always constructor class er name hoi...
//constructor of special tyep of method that is use to initializethe object
//properties of constructor
//constructor has the same as that of the class it belong
//constructor is a spicel type of method.
//constructor it has no return type even void
//it is call automaticlly
//default constructor(no paramitter),parametrized constructor

public class Teachertest {
    public static void main(String[] args) {
        Teacher teacher1;            //Object declear
        teacher1 = new Teacher("Bivuti","Male",1303244412);  /**Pramiter constructot*/    //Object Creat

        teacher1.displayInformation();


        Teacher teacher2;            //Object declear
        teacher2 = new Teacher("Peu","Female",1303244413);      //Object Creat
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("xx","yy",1234);   //object declaer and object creat
        teacher3.displayInformation();

        Teacher teacher4 = new Teacher();  /**  defoult cnostructor*/     //object declaer and object creat
        teacher4.displayInformation();

    }
}