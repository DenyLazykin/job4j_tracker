package ru.job4j.tracker;

/**
 * Отвечает за ввод данных от пользователя
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
