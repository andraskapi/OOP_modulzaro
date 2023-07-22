package person;

import person.Gender;
import person.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person viktor = new Person("Viktor",60, Gender.MALE);
        Person jani = new Person("János",48, Gender.MALE);
        Person peti = new Person("Péter",44, Gender.MALE);
        Person alexa = new Person("Alexandra",35, Gender.FEMALE);
        Person judit = new Person("Judit",42, Gender.FEMALE);
        Person kati = new Person("Katalin",45, Gender.FEMALE);
        System.out.println(Person.population());

        System.out.println(viktor.getGender().getName());
        viktor.addHobbie("zabálás");
        viktor.addHobbie("pénznyelés");
        viktor.addFriend(jani);
        viktor.addFriend(peti);
        viktor.addFriend(alexa);
        viktor.addFriend(judit);
        viktor.addFriend(kati);
        System.out.println(viktor);
        System.out.println(kati);

    }
}