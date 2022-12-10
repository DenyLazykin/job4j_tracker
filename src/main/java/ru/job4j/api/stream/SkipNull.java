package ru.job4j.api.stream;

import java.util.stream.Stream;

public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, 3, null, 5)
                .flatMap(Stream::ofNullable)
                .map(v -> "Результат:" + v)
                .forEach(System.out::println);
    }
}
