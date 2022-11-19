package ru.job4j.map;

/**
 * Класс используется, как для учеников, так и для предметов.
 *
 * @param name  Имя
 * @param score Балл
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
