package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student students : arrayList) {
            if (predicate.test(students)) {
                System.out.println(students);
            }
        }
    }
}
