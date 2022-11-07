package ru.job4j.ooa;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String draw() {
        String ls = System.lineSeparator();
        return "   *" + ls
                + "  * *" + ls
                + " *   *" + ls
                + "*******";
    }

    @Override
    public double square() {
        return 0.5 * base * height;
    }
}
