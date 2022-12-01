package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> stringList = List.of("hello", "how are u", "ok", "bye");
        stringList.forEach(s -> System.out.println(s));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.forEach(e -> {
            System.out.println(e);
            e *= 2;
            System.out.println(e);
        });
    }
}
