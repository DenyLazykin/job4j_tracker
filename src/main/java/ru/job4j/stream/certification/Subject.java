package ru.job4j.stream.certification;

/**
 * Модель данных.
 *
 * @param name  Школьный предмет.
 * @param score Аттестационный бал ученика.
 */
public record Subject(String name, int score) {
}
