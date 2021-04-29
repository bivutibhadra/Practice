package inheritenceTwo;

public class Teacher extends Person {
   private String quali;

    public String getQuali() {
        return quali;
    }
    public void setQuali(String quali) {
        this.quali = quali;
    }

    void displayInformation2(){
        displayInformation();
        System.out.println("Quli = "+getQuali());
        System.out.println("");


    }
}
