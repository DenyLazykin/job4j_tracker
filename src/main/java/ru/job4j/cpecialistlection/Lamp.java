package ru.job4j.cpecialistlection;

/**
 * Класс моделирующий лампу.
 * Реализует интерфейс ElectricityConsumer - включая лампу после включения выключателя
 */
public class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
