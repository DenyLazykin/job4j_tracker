package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Изучаем терминальную операцию операцию forEach()
 * Создаем лист объектов String
 * Запускаем поток из элементов этого листа
 * Добавляем промежуточную операцию - понижения регистра
 * Печатаем каждый измененнный объект и закрываем поток
 * forEach() применяет метод печати к каждому элементу в листе
 *
 */
public class ForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "ОДИН", "ДВА", "ТРИ"
        );
        strings.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
