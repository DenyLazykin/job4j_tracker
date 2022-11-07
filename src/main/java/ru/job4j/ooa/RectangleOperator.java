package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Для запроса параметров прямоугольника
 */
public class RectangleOperator extends ShapeOperator {
    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.println("Введите ширину прямоугольника: ");
        int width = Integer.parseInt(input.nextLine());
        System.out.println("Введите длинну прямоугольника");
        int length = Integer.parseInt(input.nextLine());
        return new Rectangle(width, length);
    }
}
