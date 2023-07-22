package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private final Gender gender;
    private List<String> hobbies;
    private List<Person> friends;
    private static int populationCount;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = new ArrayList<>();
        this.friends = new ArrayList<>();
        populationCount++;
    }

    public void addFriend(Person friend){
        friends.add(friend);

        friend.friends.add(this);

    }
    public void addHobbie(String hobbie){
        hobbies.add(hobbie);
    }

    public static int population(){
        return populationCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String friendsToString(){
        String names = "";
        for (Person actual : friends){
            names += actual.getName() + ", ";
        }
        return names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                ", friends=" + friendsToString() +
                '}';
    }
}
