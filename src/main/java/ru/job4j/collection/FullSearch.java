package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    /**
     * Извлекает все номера и убирает дубликаты
     *
     * @param list список задач
     * @return номера задач без дублей
     */
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task number : list) {
            numbers.add(number.getNumber());
        }
        return numbers;
    }
}