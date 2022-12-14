package ru.job4j.stream.certification;

/**
 * Модель данных. Используется как для учеников, так и для предметов.
 *
 * @param name  Имя ученика.
 * @param score Баллы ученика.
 */
public record Tuple(String name, double score) {
}
