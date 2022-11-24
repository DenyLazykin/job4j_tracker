package ru.job4j.zaurcollection;

import java.util.Objects;

public class StudentPriorityQueue implements Comparable<StudentPriorityQueue> {
    private String name;
    private int course;

    public StudentPriorityQueue(String name, int course) {
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
        StudentPriorityQueue that = (StudentPriorityQueue) o;
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
    public int compareTo(StudentPriorityQueue o) {
        return Integer.compare(course, o.course);
    }
}
