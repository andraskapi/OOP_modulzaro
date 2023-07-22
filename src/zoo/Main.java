package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo allatkert = new Zoo();
        Animal buksi = new Dog("Buksi", 6);
        Animal lajos = new Dog("Lajos", 11);
        Animal garfield = new Cat("Gárfild", 5);
        Animal sas = new Eagle("NagySas", 3);
        Animal pingi = new Penguin("Pipu", 14);
        Animal kigyo = new Snake("JajDeKigyó", 8);
        Animal teki = new Turtle("Donatello", 21);

        allatkert.addAnimal(buksi);
        allatkert.addAnimal(lajos);
        allatkert.addAnimal(garfield);
        allatkert.addAnimal(sas);
        allatkert.addAnimal(pingi);
        allatkert.addAnimal(kigyo);
        allatkert.addAnimal(teki);

        System.out.println(allatkert);
        allatkert.mamalList();
        allatkert.birdList();
        allatkert.reptileList();
        garfield.makeSound();

    }
}
