package ru.job4j.zaurcollection;

import java.util.Objects;

public class StudentTreeSet implements Comparable<StudentTreeSet> {
    private String name;
    private int course;

    public StudentTreeSet(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentTreeSet that = (StudentTreeSet) o;
        return course == that.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "StudentTreeSet{"
                + "name='" + name + '\''
                + ", course=" + course
                + '}';
    }

    @Override
    public int compareTo(StudentTreeSet o) {
        return Integer.compare(course, o.course);
    }
}
