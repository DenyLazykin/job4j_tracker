package ru.job4j.stream.school;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    /**
     * Принимает на вход List<Student> list и преобразует его в мапу
     *
     * @param list Список студентов
     * @return Преобразованыый список в мапу
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Student::surname,
                        student -> student,
                        (existing, replacement) -> existing
                ));
    }
}
