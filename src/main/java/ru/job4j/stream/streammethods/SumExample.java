package ru.job4j.stream.streammethods;

import ru.job4j.stream.streammethods.maptointtask.Person;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mickey", 35),
                new Person("John", 26),
                new Person("Den", 18),
                new Person("Nasty", 24),
                new Person("Ivan", 33)
        );
        int sum = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sum);
    }
}
