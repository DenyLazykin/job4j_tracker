package ru.job4j.stream.certification;

import java.util.List;

/**
 * Модель данных. Описывает ученика.
 *
 * @param name     Имя ученика.
 * @param subjects Список предметов и аттестационый бал ученика.
 */
public record Pupil(String name, List<Subject> subjects) {
}
