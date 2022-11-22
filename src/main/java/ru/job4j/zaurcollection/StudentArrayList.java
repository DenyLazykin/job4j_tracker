package ru.job4j.zaurcollection;

import java.util.Objects;

public class StudentArrayList {
    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public StudentArrayList(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", sex='" + sex + '\''
                + ", age=" + age
                + ", course=" + course
                + ", avgGrade=" + avgGrade
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentArrayList student = (StudentArrayList) o;
        return age == student.age
                && course == student.course
                && Double.compare(student.avgGrade, avgGrade) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
