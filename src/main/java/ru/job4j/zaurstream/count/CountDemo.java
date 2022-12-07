package ru.job4j.zaurstream.count;

import java.util.stream.Stream;

/**
 * Показывает сколько элементов содержит стрим
 */
public class CountDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 4);
        System.out.println(stream.count());
    }
}
