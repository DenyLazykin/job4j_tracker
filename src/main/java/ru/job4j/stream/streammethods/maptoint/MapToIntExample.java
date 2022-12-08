package ru.job4j.stream.streammethods.maptoint;

import java.util.Arrays;
import java.util.List;

/**
 * (15)Происходит преобразование объектов типа String в int.
 */
public class MapToIntExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "1", "2", "3", "4", "5"
        );
        strings.stream()
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
        System.out.println();
    }
}
