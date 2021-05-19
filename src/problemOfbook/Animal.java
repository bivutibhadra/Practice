package problemOfbook;

public class Animal {

    private int lags;

    public Animal(int lags) {
        this.lags = lags;
    }
    public void sleep() {
        String name = getClass().getSimpleName();
        System.out.println(name + "Sleeping...dont disturb");

    }
}
