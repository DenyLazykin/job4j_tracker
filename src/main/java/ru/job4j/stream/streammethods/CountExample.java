package ru.job4j.stream.streammethods;

import java.util.Arrays;
import java.util.List;

/**
 * (16) Отбираем только четный числа.
 * (17) count() считает количество четных чисел.
 */
public class CountExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                1, 2, 3, 4, 5
        );
        long sum = list.stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println(sum);
    }
}
