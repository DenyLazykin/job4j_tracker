package ru.job4j.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicate {
    public static void main(String[] args) {
        System.out.println("Пример predicate:");
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));
        System.out.println();
        System.out.println("Пример BiPredicate:");
        BiPredicate<String, Integer> stringIntegerPredicate = (s, i) -> s.contains(i.toString());
        System.out.println("Строка содержит подстроку: " + stringIntegerPredicate.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + stringIntegerPredicate.test("Name", 123));
    }
}
