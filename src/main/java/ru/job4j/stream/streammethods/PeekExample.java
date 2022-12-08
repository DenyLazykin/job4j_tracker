package ru.job4j.stream.streammethods;

import java.util.Arrays;
import java.util.List;

/**
 * Изучаем промежуточную операцию peek().
 * (22) Создаем лиси объектов StringBuilder names,
 * содержимое которых будем изменять в потоке
 * (27) Создаем лист StringBuilder editNames в котором будем изменять элементы.
 * (28) Запускаем поток.
 * (29) .peek((el -> el.append(" (student Job4j)"))) - изменяет элементы,
 * применяя append() к каждому объекту потока с помощью peek()
 * Так как peek() - промежуточный метод,
 * то после изменения эти обьекты модно использовать дальше в потоке,
 * применяя другие промежуточные методы.
 * (30) Сортируем элементы.
 * (31) Собираем все элементы потока в лист
 */
public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Den"),
                new StringBuilder("Ivan"),
                new StringBuilder("Elena")
        );
        List<StringBuilder> editNames = names
                .stream()
                .peek((el -> el.append(" (student Job4j)")))
                .sorted()
                .toList();
        System.out.println(editNames);
    }
}
