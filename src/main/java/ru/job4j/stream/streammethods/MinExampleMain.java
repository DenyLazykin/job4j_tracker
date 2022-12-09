package ru.job4j.stream.streammethods;

import ru.job4j.stream.streammethods.maptointtask.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Ищем человека с наименьшим возрастом
 * (25) В min() передаем компаратор, который задает принцип поиска по значеню поля age.
 * (26) Получаем объект Person из обертки Optional и далее получаем его возраст.
 */
public class MinExampleMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mickey", 35),
                new Person("John", 26),
                new Person("Den", 18),
                new Person("Nasty", 24),
                new Person("Ivan", 33)
        );
        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));
        int age = youngestPerson.get().getAge();
        System.out.println(age);
    }
}
