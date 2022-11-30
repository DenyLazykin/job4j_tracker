package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        System.out.println("Создаем строку и выводим ее на экран:");
        Supplier<String> stringSupplier = () -> "New string for interface";
        System.out.println(stringSupplier.get());
        System.out.println();
        System.out.println("Создадим HashSet строк из списка:");
        List<String> list = List.of(
                "one",
                "two",
                "three",
                "one",
                "two",
                "three"
        );
        Supplier<Set<String>> setSupplier = () -> new HashSet<>(list);
        Set<String> strings = setSupplier.get();
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
