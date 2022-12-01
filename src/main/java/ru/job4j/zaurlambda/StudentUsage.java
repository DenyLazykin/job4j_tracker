package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.function.Predicate;

import static ru.job4j.zaurlambda.StudentInfo.avgOfSomething;

/**
 * Лямбда выражения служат для короткой записи ананимного класса
 * StudentInfo studentInfo = new StudentInfo();
 * studentInfo.testStudents(students, new StudentChecks() {
 * aOverride
 * public boolean check(Student student) {
 * return student.age < 30;
 * }
 * });
 * С ЛВ код выглядит так:
 * studentInfo.testStudents(students, student -> student.age < 30);
 */
public class StudentUsage {
    public static void main(String[] args) {
        Student studentIvan = new Student("Ivan", 'm', 22, 3, 8.3);
        Student studentNiko = new Student("Niko", 'm', 28, 2, 6.4);
        Student studentElena = new Student("Elena", 'f', 19, 1, 8.9);
        Student studentPetr = new Student("Petr", 'm', 35, 4, 7D);
        Student studentMary = new Student("Mary", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(studentIvan);
        students.add(studentNiko);
        students.add(studentElena);
        students.add(studentPetr);
        students.add(studentMary);
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudents(students, student -> student.age < 30);
        System.out.println();
        studentInfo.testStudents(students, student -> student.avgGrade > 8);
        System.out.println();
        studentInfo.testStudents(students, student -> student.age > 20
                && student.avgGrade < 9.3
                && student.sex == 'f');
        System.out.println();
        System.out.println("Применяем predicate:");
        Predicate<Student> predicateGrade = student -> student.avgGrade > 7.5;
        Predicate<Student> predicateSex = student -> student.sex == 'f';
        studentInfo.testStudents(students, predicateGrade.and(predicateSex));
        System.out.println();
        studentInfo.testStudents(students, predicateGrade.or(predicateSex));
        System.out.println();
        System.out.println("Negate method:");
        studentInfo.testStudents(students, predicateGrade.negate());
        System.out.println();
        System.out.println("Средняя оценка всех студентов :");
        double rsl = avgOfSomething(students, s -> s.avgGrade);
        System.out.println(rsl);
    }
}
