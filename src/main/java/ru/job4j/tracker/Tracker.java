package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Добавляет заявку, переданную в аргументах в массив заявок items
     *
     * @param item заявку объекта Item
     * @return заявку, которая добавляется в проект
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Возвращает копию массива items без null элементов
     *
     * @return отредактированный масив
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, size);
    }

    /**
     * Проверяет в цикле все элементы массива items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * @param key название, которое необходимо найти
     * @return результат поиска
     */
    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(this.items[index].getName())) {
                rsl[i] = this.items[index];
                i++;
            }
        }
        rsl = Arrays.copyOf(rsl, i);
        return rsl;
    }

    /**
     * Проверяет в цикле все элементы массива items, сравнивая id с аргументом int id
     * @param id номер заявки
     * @return null - если заявка не найдена.
     */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}