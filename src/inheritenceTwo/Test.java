package inheritenceTwo;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.setName("Bivuti");
        t1.setAge(28);
        t1.setQuali("Bsc in CSE");

        t2.setName("Hashidhar");
        t2.setAge(20);
        t2.setQuali("Bsc in NFE");

        t1.displayInformation2();
        t2.displayInformation2();

    }
}
