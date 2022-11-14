package ru.job4j.tracker;

import java.util.List;

/**
 * Паттерн синглетон
 */
public final class SingleTracker {
    private Tracker tracker = new Tracker();
    /**
     * Реализуем синглетон
     * Создаем единственный объект класса SingleTracker
     */
    private static SingleTracker instance = null;

    /**
     * Создаем закрытый конструктор
     */
    private SingleTracker() {
    }

    /**
     * Метод используется для публикации ссылки
     *
     * @return объект класса SingleTracker
     */
    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    /**
     * Добавляем методы из класса Tracker
     */
    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public List<Item> findByName(String name) {
        return tracker.findByName(name);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
