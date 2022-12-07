package ru.job4j.zaurstream.flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель данных описывающая кто учится на факультете
 */
public class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFac(Student student) {
        studentsOnFaculty.add(student);
    }
}
