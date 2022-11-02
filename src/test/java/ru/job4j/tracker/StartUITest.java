package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    /**
     * Порядок действий.
     * 1. Создаем объект tracker.
     * 2. Создаем объект item.
     * 3. Добавляем item в tracker. После этой операции у нас есть id.
     * 4. Достаем item.id и создаем массив с ответами пользователя.
     * 5. Вызываем тестируемый метод editItem. Это действие изменит состояние объекта tracker.
     * 6. Ищем по item.id замененный item в объекте tracker.
     * 7. Сравниваем имя найденной заявки с ожидаемой.
     */
    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("delete item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId())
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}