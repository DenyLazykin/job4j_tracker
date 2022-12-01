package ru.job4j.zaurlambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student students : arrayList) {
            if (studentChecks.check(students)) {
                System.out.println(students);
            }
        }
    }
}
