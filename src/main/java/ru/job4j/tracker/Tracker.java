package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Логика приложения
 */
public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    /**
     * Добавляет заявку, переданную в аргументах в массив заявок items
     *
     * @param item заявку объекта Item
     * @return заявку, которая добавляется в проект
     */
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /**
     * Осуществляет поиск всех созданных заявок
     *
     * @return Возвращает копию списка
     */
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    /**
     * Осуществляет поиск заявок по имени.
     * Проверяет в цикле все элементы списка.
     * Элементы у которых name - совпадают - добавляет в список
     *
     * @param name Название, которое необходимо найти
     * @return результат поиска
     */
    public List<Item> findByName(String name) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (name.equals(item.getName())) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    /**
     * Осуществляет поиск заяки по id при помощи метода indexOf(int id);
     * В цикле проверяет все элементы списка items сравнивая полученный id с id из аргумента методда
     *
     * @param id номер заявки
     * @return null - если заявка не найдена.
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод для возврата index по id
     *
     * @param id Номер заявки
     * @return -1 если index не найден
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Для замены заявки
     *
     * @param id   Номер заявки
     * @param item На что меняем
     * @return Замененную заяку
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            items.set(index, item);
            item.setId(id);
        }
        return validate;
    }

    /**
     * Удаляет заявку
     *
     * @param id Номер удаляемой заявки
     * @return false усли удалить не получилось
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean validate = index != -1;
        if (validate) {
            items.remove(index);
        }
        return validate;
    }
}