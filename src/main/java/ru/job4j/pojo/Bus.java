package ru.job4j.pojo;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едем по дорогам");
    }

    @Override
    public void characteristic() {
        System.out.println(getClass().getSimpleName()
                + " когда еду делаю ВРУМ ВРУМ и подрезаю других");
    }
}
