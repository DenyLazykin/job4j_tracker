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
     * flatMap() для преобразования в поток объектов Subject.
     * mapToInt() для последующего преобразования в потом оценок по каждому предмету.
     * average() для расчета среднего бала по предмету.
     * orElse() для того чтобы вернуть значение по умолчанию.
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
     * map() для преобразования в поток объектов класса Tuple, внутри метода мы будем создавать эти объекты,
     * в конструктор первым параметром будет передаваться имя текущего объекта Pupil-используем соответствующий геттер.
     * collect() собирает результаты в коллекцию List.
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
     * flatMap() для преобразования в поток объектов Subject.
     * Метод collect() в который мы передаем метод groupingBy() класса Collectors.
     * Карта собирается следующим образом: ключ - это имя предмета,
     * тип карты, который будем использоватб - LinkedHashMap::new,
     * значение карты - средний балл по этому предмету для каждого ученика.
     * averagingDouble() - расчитывает средний балл по этому предмету для каждого ученика.
     * Разбираем собранную карту с помощью entrySet() и открываем поток с помощью stream().
     * Полученный поток с помощью map() преобразуем в поток объектов класса Tuple,
     * внутри метода мы будем создавать эти объекты.
     * В конструктор мы будем передавать параметры с помощью методов getKey() и getValue() интерфейса Entry;
     * collect() собирает результаты в коллекцию List.
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
                .map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Для вычисления лучшего ученика, у которого наибольший суммарный балл по всем предметам.
     * map() преобразует поток в поток объектов класса Tuple, создавая внутри метода объекты этого класса.
     * mapToInt() преобразует оценки по каждому предмету.
     * sum() расчитывает суммарный балл.
     * Терминальная операция max(), в который будем передавать компаратор,
     * компаратор определит объект Tuple, у которого значение score будет максимальным;
     * orElse() - возвращает значение по умолчанию.
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
     * flatMap() для преобразования в поток объектов Subject.
     * Метод collect() в который мы передаем метод groupingBy() класса Collectors.
     * Карта собирается следующим образом: ключ - это имя предмета,
     * значение карты - средний балл по этому предмету для каждого ученика.
     * summingDouble() - расчитывает суммарный балл по этому предмету для каждого ученика.
     * Разбираем собранную карту с помощью entrySet() и открываем поток с помощью stream().
     * Полученный поток с помощью map() преобразуем в поток объектов класса Tuple,
     * внутри метода мы будем создавать эти объекты.
     * В конструктор мы будем передавать параметры с помощью методов getKey() и getValue() интерфейса Entry;
     * Терминальная операция max(), в который будем передавать компаратор,
     * компаратор определит объект Tuple, у которого значение score будет максимальным;
     * orElse() - возвращает значение по умолчанию.
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
                .map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}
