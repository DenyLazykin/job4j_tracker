package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student students : arrayList) {
            if (predicate.test(students)) {
                System.out.println(students);
            }
        }
    }

    static double avgOfSomething(List<Student> studentList, Function<Student, Double> function) {
        double result = 0;
        for (Student student : studentList) {
            result += function.apply(student);
        }
        result = result / studentList.size();
        return result;
    }
}
