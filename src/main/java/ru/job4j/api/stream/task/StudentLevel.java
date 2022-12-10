package ru.job4j.api.stream.task;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((left, right) -> Integer.compare(right.score(), left.score()))
                .takeWhile(student ->  student.score() > bound)
                .collect(Collectors.toList());
    }
}

