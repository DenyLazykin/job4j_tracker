package ru.job4j.stream.streammethods.maptoint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * (13) Создается поток из примитивных чисел от 1 до 5 включительно
 * (14) mapToObj() преобразует все элементы потока примитивного типа int в строки типа String
 */
public class MapToObjExample {
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 5)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
