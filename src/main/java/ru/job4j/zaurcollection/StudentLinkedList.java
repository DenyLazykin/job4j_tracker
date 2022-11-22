package ru.job4j.zaurcollection;

import java.util.Objects;

public class StudentLinkedList {
    private String name;
    private int course;

    public StudentLinkedList(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentLinkedList that = (StudentLinkedList) o;
        return course == that.course && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "StudentLinkedList"
                + "name='" + name + '\''
                + ", course=" + course
                + '}';
    }
}
