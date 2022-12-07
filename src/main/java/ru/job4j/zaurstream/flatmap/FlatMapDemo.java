package ru.job4j.zaurstream.flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Используем когда нам необходимо работать с элементами элементов нашей коллекции
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        Student studentIvan = new Student("Ivan", 'm', 22, 3, 8.3);
        Student studentNiko = new Student("Niko", 'm', 28, 2, 6.4);
        Student studentElena = new Student("Elena", 'f', 19, 1, 8.9);
        Student studentPetr = new Student("Petr", 'm', 35, 4, 7D);
        Student studentMary = new Student("Mary", 'f', 23, 3, 9.1);
        Faculty facultyEconomics = new Faculty("Economics");
        Faculty facultyMath = new Faculty("Math");
        facultyEconomics.addStudentToFac(studentIvan);
        facultyEconomics.addStudentToFac(studentNiko);
        facultyEconomics.addStudentToFac(studentElena);
        facultyMath.addStudentToFac(studentPetr);
        facultyMath.addStudentToFac(studentMary);
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(facultyEconomics);
        facultyList.add(facultyMath);
        facultyList.stream()
                .flatMap(faculty ->
                        faculty.getStudentsOnFaculty()
                                .stream())
                .forEach(student -> System.out.println(student.name()));
    }
}
