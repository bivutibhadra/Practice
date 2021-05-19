package problemOfbook;

public class MiniZoo {
    private Animal[] animals;

    public MiniZoo(Animal[] animals){
        this.animals=animals;
    }

    public void putTheThemOnSleep(){
        for (Animal animal: animals){
            animal.sleep();
        }
    }

}

