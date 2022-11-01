package ru.job4j.pojo;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едем по рельсам");
    }

    @Override
    public void characteristic() {
        System.out.println(getClass().getSimpleName()
                + " когда еду делаю ЧУЧУХ ЧУЧУХ");
    }
}
