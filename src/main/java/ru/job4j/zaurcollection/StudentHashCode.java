package ru.job4j.zaurcollection;

import java.util.Objects;

public class StudentHashCode {
    private String name;
    private String surname;
    private int course;

    public StudentHashCode(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
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
        StudentHashCode that = (StudentHashCode) o;
        return course == that.course
                && Objects.equals(name, that.name)
                && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "StudentHashCode{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", course=" + course
                + '}';
    }
}
