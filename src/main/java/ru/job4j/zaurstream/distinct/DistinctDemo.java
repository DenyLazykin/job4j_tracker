package ru.job4j.zaurstream.distinct;

import java.util.stream.Stream;

/**
 * Убирает дубли из стрима
 */
public class DistinctDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 4);
        stream.distinct()
                .forEach(System.out::println);
    }
}
