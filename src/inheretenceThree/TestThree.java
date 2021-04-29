package inheretenceThree;

public class TestThree {
    public static void main(String[] args) {
        Annimal A = new Annimal();
        Person P = new Person();
        Teacher T = new Teacher();

        System.out.println(A instanceof Annimal);
        System.out.println(P instanceof Annimal);
        System.out.println(T instanceof Person);
        System.out.println(T instanceof Annimal);
        System.out.println(P instanceof Teacher);


    }
}
