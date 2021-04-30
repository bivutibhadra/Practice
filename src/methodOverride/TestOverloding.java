
package methodOverride;

public class TestOverloding {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Person p1 = new Person();


        t1.name="Bivuti";
        t1.age=28;
        t1.quali="Bsc in cse";

        t1.displayInformation();

        p1.name="Hashi dhar";
        p1.age=18;

        p1.displayInformation();

    }
}
