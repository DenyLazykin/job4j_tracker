package ru.job4j.stream.streammethods;

import ru.job4j.stream.streammethods.maptointtask.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        System.out.println("Стандартная форма reduce()");
        List<Integer> nums = List.of(
                1, 2, 3, 4
        );
        Optional<Integer> sum = nums.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum.get());
        System.out.println("Складываем строки");
        List<String> numsString = List.of(
                "One", "Two", "Three"
        );
        Optional<String> sumString = numsString.stream()
                .reduce((a, b) -> a + " " + b);
        System.out.println(sumString.get());
        System.out.println("reduce с identity:");
        int sumIdentity = nums.stream()
                .reduce(5, (a, b) -> a + b);
        System.out.println(sumIdentity);
        System.out.println("Третья форма reduce");
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Мария", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sumReduce = people.stream()
                .reduce(
                        0,
                        (a, b) -> {
                            if (b.getAge() > 25) {
                                return a + b.getAge();
                            } else {
                                return a;
                            }
                        },
                        (a, b) -> a + b
                );
        System.out.println(sumReduce);
    }
}
