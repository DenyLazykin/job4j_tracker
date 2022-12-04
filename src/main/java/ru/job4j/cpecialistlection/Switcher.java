package ru.job4j.cpecialistlection;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс моделирующий выключатель электричества
 */
public class Switcher {
    /**
     * Поле типа интерфейс для хранения потребителей
     */
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    /**
     * Для добавления потребителя в электрическую сеть
     *
     * @param listener Того. кого хотим добивать в электрическую сеть
     */
    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    /**
     * Для удаления потребителя из электрической сети
     *
     * @param listener Того. кого хотим удалить из электрической сети
     */

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    /**
     * Проверяет есть ли в поле типа интерфейса ссылки на объект
     * Если есть вызывает метод electricityOn этого обьекта
     */
    public void switchOn() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer consumer : listeners) {
            consumer.electricityOn();
        }
    }
}
