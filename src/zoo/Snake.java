package zoo;

public class Snake extends Reptile{
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("SS SSSSS");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
