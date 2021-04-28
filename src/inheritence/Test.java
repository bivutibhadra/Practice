package inheritence;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.name = "Bivuti";
        t1.age = 30;
        t1.quali = "Bsc";
        t1.displayInformation2();

        t2.name = "Hashi";
        t2.age = 25;
        t2.quali = "Bsc";
        t2.displayInformation2();
    }
}
