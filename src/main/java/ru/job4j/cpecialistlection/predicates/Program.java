package ru.job4j.cpecialistlection.predicates;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Класс, в котором описана бизнес логика приложения
 */
public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 17));
        persons.add(new Person("Глаша", 23));
        persons.add(new Person("Саша", 26));
        persons.add(new Person("Анна", 18));
        persons.forEach(System.out::println);
        System.out.println();
        persons.stream().
                filter(person -> person.getAge() >= 18).
                sorted(Comparator.comparing(Person::getName)).
                forEach(System.out::println);
        System.out.println();
        double averageGrade = persons.stream().
                filter(p -> p.getAge() >= 18).
                mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(averageGrade);
    }
}
