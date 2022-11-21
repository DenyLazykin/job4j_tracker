package ru.job4j.generics;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" + "value=" + value + '}';
    }
}
