package ru.job4j.ooa;

public class Rectangle implements Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String draw() {
        String ls = System.lineSeparator();
        return "******" + ls
                + "*    *" + ls
                + "*    *" + ls
                + "******";
    }

    @Override
    public double square() {
        return width * length;
    }
}
