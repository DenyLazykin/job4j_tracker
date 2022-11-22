package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.List;

public class StudentWrites {
    public static void main(String[] args) {
        Student studentDen = new Student("Den", "M", 33, 5, 10);
        Student studentNasty = new Student("Nasty", "F", 33, 5, 9);
        Student studentIvan = new Student("Ivan", "M", 33, 5, 4);
        Student studentIvan2 = new Student("Ivan", "M", 33, 5, 4);
        List<Student> studentList = new ArrayList<>();
        studentList.add(studentDen);
        studentList.add(studentNasty);
        studentList.add(studentIvan);
        studentList.add(studentIvan2);
        System.out.println(studentList);
        studentList.remove(studentIvan2);
        System.out.println(studentList);
        int index = studentList.indexOf(studentIvan2);
        System.out.println(index);
    }
}
