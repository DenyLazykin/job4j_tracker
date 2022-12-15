package ru.job4j.stream.certification;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс получает статистику по аттестатам.
 */
public class Analyze {
    /**
     * Вычисляет общий средний бал.
     *
     * @param stream Поток объектов Pupil.
     * @return Средний балл по предметам.
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0);
    }

    /**
     * Вычисляет средний балл по каждому ученику.
     *
     * @param stream Поток объектов Pupil.
     * @return Средний балл по каждому ученику.
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects().stream()
                        .mapToInt(Subject::score)
                        .average()
                        .orElse(0)))
                .collect(Collectors.toList());
    }

    /**
     * Вычисляет средний балл по каждому предмету.
     *
     * @param stream Поток объектов Pupil.
     * @return Средний балл по каждому предмету.
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::score)))
                .entrySet().stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Для вычисления лучшего ученика, у которого наибольший суммарный балл по всем предметам.
     *
     * @param stream Поток объектов Pupil.
     * @return Лучшего ученикаю
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects().stream()
                        .mapToInt(Subject::score)
                        .sum()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }

    /**
     * Для вычисления предмета с наибольшим баллом для всех учеников.
     *
     * @param stream Поток объектов Pupil.
     * @return Возвращает предмет с наибольшим баллом для всех учеников.
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingDouble(Subject::score)))
                .entrySet().stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}
