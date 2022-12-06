package ru.job4j.stream.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    /**
     * Фильтрует учеников и добаляет их в список
     *
     * @param students  Список учеников
     * @param predicate Функциональный интрефейс
     * @return Отфильтрованный список
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
