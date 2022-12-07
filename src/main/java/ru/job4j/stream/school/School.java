package ru.job4j.stream.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    /**
     * Фильтрует и преобразует список студентов по среднему балу
     * Убираем из потока пустые элементы,
     * поток сортируем,
     * потом фильтруем по уровню,
     * сохраняем в список
     *
     * @param students Список втудентов
     * @param bound    Балл студентов
     * @return Преобразованный список
     */
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .filter(student ->
                        student.score() > bound)
                .collect(Collectors.toList());
    }
}
