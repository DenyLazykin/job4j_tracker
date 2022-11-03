package ru.job4j.tracker;

/**
 * Все действия, которые можно совершать
 */
public interface UserAction {
    String name();

    /**
     *
     * @param input данные о заявке
     * @param tracker объект Tracker
     * @return Если действие вернуло false, то мы считаем, что пользователь вышел из системы.
     */
    boolean execute(Input input, Tracker tracker);
}
