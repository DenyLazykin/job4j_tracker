package ru.job4j.stream.streammethods;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Один", "Два", "Три", "Четыре", "Пять"
        );
        boolean resultNone = strings.stream()
                .noneMatch("One"::contains);
        System.out.println(resultNone);
        boolean resultAny = strings.stream()
                .anyMatch(e -> e.endsWith("ь"));
        System.out.println(resultAny);
        List<String> stringList = Arrays.asList(
                "Трижды",
                "Три",
                "Триста",
                "Три тысячи"
        );
        boolean resultAll = stringList.stream()
                .allMatch(e -> e.startsWith("Три"));
        System.out.println(resultAll);
    }
}
