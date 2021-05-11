package typeCusting2;

public class CustingTest {                       // non-premitive data type
    public static void main(String[] args) {
        PersonSuper p = new TeacherSub();     //{ai khane upcusting hoscha}
                                                   // Person class er undera sub-class er akta object toire korchi
                                                  //sub-class ta k super class aa rekhe delam
                                                 //p ta techer class k nirdesh kortecha
        p.displayInformation();


        TeacherSub t = (TeacherSub) new PersonSuper(); // { ai kahne down custing kora hoyisa}
                                                       // downcusting java te support kore na
        t.displayInformation();


    }

}
