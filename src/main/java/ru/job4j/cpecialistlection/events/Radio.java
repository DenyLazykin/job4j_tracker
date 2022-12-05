package ru.job4j.cpecialistlection.events;

/**
 * Класс моделирующий радио
 */
public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("Радио заиграло");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
