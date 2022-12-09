package ru.job4j.map.findstudent;

import java.util.Objects;

/**
 * Модель данных. Описывает изучаемый предмет
 */
public class Subject {
    private String name;
    private int scope;

    public Subject(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subject subject = (Subject) o;
        return scope == subject.scope && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scope);
    }

    @Override
    public String toString() {
        return String.format("Subject(name=%s ,scope=%s)",
                this.name,
                this.scope);
    }
}
