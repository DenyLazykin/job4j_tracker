package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Логика приложения
 */
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
     *
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
     *
     * @param id номер заявки
     * @return null - если заявка не найдена.
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод для возврата index по id
     *
     * @param id номер заявки
     * @return -1 если index не найден
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Для замены заявки
     *
     * @param id   номер заявки
     * @param item на что меняем
     * @return замененную заяку
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            items[index] = item;
            item.setId(id);
        }
        return validate;
    }

    /**
     * Удаляет заявку с помощь метода System.arraycopy,
     * который копирует блоки массива целеком
     * System.arraycopy(source, startPos, dist, distPos, length);
     * source - массив откуда нужно скопировать элементы начиная с позиции startPos и до позиции startPos + length.
     * length - сколько элементов взять начиная от startPos.
     * dist - массив, куда вставить скопированные элементы от source.
     * Этот метод может работать с одним массивом для source и dist.
     * distPos - начиная с какого элемента вставлять скопированные ячейки.
     *
     * @param id номер удаляемой заявки
     * @return false усли удалить не получилось
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return validate;
    }
}