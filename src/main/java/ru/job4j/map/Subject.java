package ru.job4j.map;

/**
 * Класс описывает школьный предмет и аттестационный балл ученика
 *
 * @param name  Школьный предмет
 * @param score Аттестационный бал
 */
public record Subject(String name, int score) {
}
