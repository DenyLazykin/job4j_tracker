package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Класс описывает точку, в системе координат
 */
public class Point {
    private int x;
    private int y;
    private int s;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    /**
     * Метод вычисляет между точками в системе координат
     *
     * @param that принимает координаты точки
     * @return результат вычислений
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод вычисляет расстояние между точками в трехмерном пространстве
     *
     * @param that принимает координаты точки
     * @return результат вычислений
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.s - that.s, 2));
    }

    /**
     * Вывод инфо о координатах точки
     */
    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    /**
     * Вывод инфо о координатах точки в трехмерном пространстве
     */
    public void info3d() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.s + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 2, 4);
        double distance = a.distance3d(b);
        System.out.println(distance);
        a.info3d();
        Point c = new Point(0, 3);
        c.info();
    }
}
