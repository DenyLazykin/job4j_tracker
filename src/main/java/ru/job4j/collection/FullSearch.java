package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    /**
     * Извлекает все номера и убирает дубликаты
     * В цикле для перебора используем list.
     * В теле добавляем номер вызванный на элементе листа к HashSet
     *
     * @param list Список задач
     * @return Номера задач без дублей
     */
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task number : list) {
            numbers.add(number.getNumber());
        }
        return numbers;
    }
}