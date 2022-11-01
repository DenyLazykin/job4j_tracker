package ru.job4j.pojo;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летаем по воздушным потокам");
    }

    @Override
    public void characteristic() {
        System.out.println(getClass().getSimpleName()
                + " когда лечу делаю ВЖУХ");
    }
}
