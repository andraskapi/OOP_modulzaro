package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList;

    public Zoo() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void removeAnimal(String animalName) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getName().equalsIgnoreCase(animalName)) {
                animalList.remove(i);
                i--;
            }

        }
    }


    public List<Animal> getAnimalList() {
        return animalList;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalList=" + animalList +
                '}';
    }

    public void mamalList() {
        System.out.println("Emlősök az állatkertben: ");
        for (Animal actual : animalList) {
            if (actual instanceof Mammal) {
                System.out.println("Állat neve: " + actual.getName() + " - " + "Állat kora: " + actual.getAge());
            }
        }
    }

    public void birdList() {
        System.out.println("Madarak az állatkertben: ");
        for (Animal actual : animalList) {
            if (actual instanceof Bird) {
                System.out.println("Állat neve: " + actual.getName() + " - " + "Állat kora: " + actual.getAge());
            }
        }
    }

    public void reptileList() {
        System.out.println("Hüllők az állatkertben: ");
        for (Animal actual : animalList) {
            if (actual instanceof Reptile) {
                System.out.println("Állat neve: " + actual.getName() + " - " + "Állat kora: " + actual.getAge());
            }
        }
    }

}
