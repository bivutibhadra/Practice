package finalKeyword;

public class University {

    final String UNIVERSITY = "DIU";         // final keyword use korla capital later use kora ta batter
    final int fees ;   //blank final variable

    /** static final int fees;
     *
     * static {                                          //static blanck  final veriable
     *     fees = 48000;
     * }
     */

    University (){          //   constuctor kore diclear korte hobe
        fees = 48000;

    }

    void displayInformation(){
      //  name = "dd";                         final key word use korla value change kora jai na...
        System.out.println("Name = "+UNIVERSITY);
        System.out.println("Fees = "+fees);


    }
}
