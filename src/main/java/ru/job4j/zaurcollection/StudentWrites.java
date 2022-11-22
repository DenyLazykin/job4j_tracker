package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.List;

public class StudentWrites {
    public static void main(String[] args) {
        StudentArrayList studentDen = new StudentArrayList("Den", "M", 33, 5, 10);
        StudentArrayList studentNasty = new StudentArrayList("Nasty", "F", 33, 5, 9);
        StudentArrayList studentIvan = new StudentArrayList("Ivan", "M", 33, 5, 4);
        StudentArrayList studentIvan2 = new StudentArrayList("Ivan", "M", 33, 5, 4);
        List<StudentArrayList> studentList = new ArrayList<>();
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
