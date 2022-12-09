package ru.job4j.stream.streammethods;

import ru.job4j.stream.streammethods.maptointtask.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mickey", 35),
                new Person("John", 26),
                new Person("Den", 18),
                new Person("Nasty", 24),
                new Person("Ivan", 33)
        );
        Optional<Person> youngestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));
        int age = youngestPerson.get().getAge();
        System.out.println(age);
    }
}
