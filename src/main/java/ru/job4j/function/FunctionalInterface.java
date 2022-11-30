package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        System.out.println("Вставляем элементы в карту с использованием biConsumer");
        Map<Integer, String> map = new HashMap();
        BiConsumer<Integer, String> biConsumer =
                (i, s) -> map.put(i, s);
        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");
        System.out.println("Проверка элементов");
        BiPredicate<Integer, String> biPredicate = (i, s) -> (i % 2 == 0) || s.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPredicate.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        System.out.println("Создаем ArrayList из значений Map с помощью supplier");
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        List<String> strings = supplier.get();
        System.out.println("Вывод строк с помощью consumer");
        Consumer<String> consumer = (s) -> System.out.println(s);
        System.out.println("Преобразование строк к строкам в верхнем регистре");
        Function<String, String> function = (s) -> s.toUpperCase();
        for (String s : strings) {
            consumer.accept(function.apply(s));
        }
    }
}