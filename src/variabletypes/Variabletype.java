package variabletypes;

public class

Variabletype { // instanc variable

                               /** A variable that is decleared inside the class outside the Method,
                                that call is instanc variable.

                                It is not decaluer as static
                                */
    String name;
    int id;
    static String universityname;     // static/class  variable.
                                    /** A variable that is declear as static is call static/class variable.
                                      is can not declear to local variable.*/


    Variabletype(String n,int i){        // "n , i " local variable
                                    /** A variable that is decleared inside the method is call local variable.
                                     local variable is declared inside Method,Constructor or in a Block */
        name = n ;
        id = i;
    }
    void display(){
        System.out.println("Name= "+name);
        System.out.println("Name= "+id);
        System.out.println("Name= "+universityname);



    }
}
