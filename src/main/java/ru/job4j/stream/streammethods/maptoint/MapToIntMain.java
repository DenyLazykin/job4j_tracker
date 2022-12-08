package ru.job4j.stream.streammethods.maptoint;

import java.util.Arrays;
import java.util.List;

/**
 * (21) mapToInt() преобразует поток Person в поток int.
 * (24) sum() суммирует элементы полученного числового потока.
 */
public class MapToIntMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mickey", 35),
                new Person("John", 26),
                new Person("Den", 18),
                new Person("Nasty", 24),
                new Person("Ivan", 33)
        );
        int sum = people.stream()
                .filter(e -> e.getAge() > 25)
                .mapToInt(Person::getAge)
                .peek(System.out::println)
                .sum();
        System.out.println("Total: " + sum);
    }
}
