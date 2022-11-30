package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceUsageConsumerAndBiConsumer {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "New string for interface";
        System.out.println("Consumer demonstration:");
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(stringSupplier.get());
        System.out.println();
        System.out.println("BiConsumer demonstration:");
        BiConsumer<String, String> biConsumer = (s, s1) -> System.out.println(s + s1);
        biConsumer.accept(stringSupplier.get(), " and second string");
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
        BiConsumer<Integer, String> biConsumeList = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = setSupplier.get();
        int i = 1;
        for (String s : strings) {
            biConsumeList.accept(i++, " is " + s);
        }
    }
}
