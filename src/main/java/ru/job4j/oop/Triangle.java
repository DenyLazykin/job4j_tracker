package ru.job4j.oop;

import static java.lang.Math.sqrt;

/**
 * Класс расчитывает площадь треугольника
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Выполняет расчет полупериметра треугольника
     * @param a сторона 1
     * @param b сторона 2
     * @param c сторона 3
     * @return результат вычисления полупериметра
     */
    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Проверяет возможно ли из сторон с длинами a, b и c построить треугольник
     * @param ab стороны 1 и 2
     * @param ac стороны 1 и 3
     * @param bc стороны 2 и 3
     * @return true - если возможно
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc)
                && (ac + bc > ab)
                && (ab + bc > ac);
    }

    /**
     * Рассчитывает площадь треугольника согласно формуле Герона
     * @return возвращает -1, если расчитать площадь не возможно. Если возможно - результат вычислений.
     */
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            rsl = sqrt((p * (p - ab) * (p - ac) * (p - bc)));
        } else {
            System.out.println("Площадь расчитать невозможно");
        }
        return rsl;
    }
}
