package ru.job4j.collection;

/**
 * Модель данных задач. Описывает номер задачи и ее описание
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
