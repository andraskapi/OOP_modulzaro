package zoo;

public class Reptile extends Animal implements Oviparous, Viviparous{


    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {

    }


}
