package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Для запроса параметров треугольника
 */
public class TriangleOperator extends ShapeOperator {
    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.println("Введите длинну остнования треугольника: ");
        int base = Integer.parseInt(input.nextLine());
        System.out.println("Введите высоту треугольника");
        int height = Integer.parseInt(input.nextLine());
        return new Triangle(base, height);
    }
}
