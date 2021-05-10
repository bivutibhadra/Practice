package polymorphismRunTime;

public class Test {
    int result;

    void sum() {
        System.out.println("No answer here");
    }

    void sum(int x, int y) {
        result = x + y;
        System.out.println("Answer = " + result);
    }

    void sum(int x, int y, int z) {
        result = x + y + z;
        System.out.println("Answer = " + result);
    }

    public static void main(String[] args) {
        Test ob1 = new Test();

        ob1.sum();
        ob1.sum(5, 8);
        ob1.sum(6, 9, 7);
    }

}

