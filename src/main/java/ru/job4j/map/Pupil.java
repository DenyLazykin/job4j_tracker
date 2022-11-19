package ru.job4j.map;

import java.util.List;

/**
 * Класс описывает ученика
 *
 * @param name     Имя ученика
 * @param subjects Список ученика
 */
public record Pupil(String name, List<Subject> subjects) {
}
