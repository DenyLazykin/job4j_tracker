package ru.job4j.stream.streammethods;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "One",
                "Two",
                "Three",
                "Four",
                "Five"
        );
        List<String> resultSkip = strings
                .stream()
                .skip(1)
                .toList();
        System.out.println(resultSkip);
        System.out.println();
        List<String> resultLimit = strings
                .stream()
                .limit(3)
                .toList();
        System.out.println(resultLimit);
        System.out.println();
        List<String> resultLimitPlusSkip = strings
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(resultLimitPlusSkip);
        System.out.println();
        String resultFindFirst = strings
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultFindFirst);
        System.out.println();
        String resultFindFirstDefault = strings
                .stream()
                .skip(5)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultFindFirstDefault);
        System.out.println();
        String resultFindLast = strings
                .stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultFindLast);
    }
}
