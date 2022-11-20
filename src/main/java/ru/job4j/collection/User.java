package ru.job4j.collection;

import java.util.Objects;

/**
 * Модель данных
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Метод сравнивает имена и в случае равенства возращает результат сравнения возраста
     * @param o the object to be compared.
     * @return Возращает результат сравнения возраста, если имена равны
     */
    @Override
    public int compareTo(User o) {
        int nameCompare = name.compareTo(o.name);
        return nameCompare != 0 ? nameCompare : Integer.compare(age, o.age);
    }
}
