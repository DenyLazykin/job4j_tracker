package ru.job4j.stream.streammethods;

import java.util.*;
import java.util.stream.IntStream;

/**
 * (17) min() вычисляет минимальное значение с помощью переданного нами компаратора сравнения обьектов по возрастанию.
 * (21) rangeClosed() Запустили поток примитивных чисел/
 * (22) Нашли минимальное число и потока/
 */
public class MinExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                4, 5, 1, 3, 2
        );
        Optional<Integer> minEl = list.stream()
                .min(Comparator.naturalOrder());
        System.out.println(minEl);
        System.out.println();
        OptionalInt min = IntStream
                .rangeClosed(24, 25)
                .min();
        System.out.println(min);
    }
}
