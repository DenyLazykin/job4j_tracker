package ru.job4j.zaurstream.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Фильтрует элементы в соответствии с указанным условием
 */
public class FilterDemo {
    public static void main(String[] args) {
        Student studentIvan = new Student("Ivan", 'm', 22, 3, 8.3);
        Student studentNiko = new Student("Niko", 'm', 28, 2, 6.4);
        Student studentElena = new Student("Elena", 'f', 19, 1, 8.9);
        Student studentPetr = new Student("Petr", 'm', 35, 4, 7D);
        Student studentMary = new Student("Mary", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(studentIvan);
        students.add(studentNiko);
        students.add(studentElena);
        students.add(studentPetr);
        students.add(studentMary);
        students.stream()
                .filter(student ->
                        student.age() > 22
                                && student.avgGrade() < 7.2)
                .forEach(System.out::println);
    }
}
