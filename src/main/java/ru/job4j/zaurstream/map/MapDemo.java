package ru.job4j.zaurstream.map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Map() - берет по очереди каждый элемент из нашего стрима
 * и сопоставляет ему элемент, который из него получается после примененния на нем тех действий
 * который мы описываем внутри Мар() с помощь лямбда выражений
 */
public class MapDemo {
    public static void main(String[] args) {
        System.out.println("Пример с коллекцией List");
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("how are u");
        list.add("ok");
        list.add("bye");
        list.stream()
                .map(element -> element.length())
                .toList()
                .forEach(System.out::println);
        System.out.println("Стримы и массивы:");
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array)
                .map(element -> {
                            if (element % 3 == 0) {
                                element = element / 3;
                            }
                            return element;
                        }
                ).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Пример с коллекцией Set");
        Set<String> set = new TreeSet<>();
        set.add("hi");
        set.add("how are u");
        set.add("ok");
        set.add("bye");
        System.out.println(set);
        set.stream()
                .map(e -> e.length())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
