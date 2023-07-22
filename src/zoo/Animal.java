package zoo;

public abstract class Animal {

    protected final String name;
    protected final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public abstract void makeSound();


}
