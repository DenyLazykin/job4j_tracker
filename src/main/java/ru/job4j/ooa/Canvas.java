package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Описывает общее поведение системы. Запускает приложение
 */
public class Canvas {
    private ShapeOperator shapeOperator;

    public Canvas(ShapeOperator shapeOperator) {
        this.shapeOperator = shapeOperator;
    }

    public void demonstrate() {
        this.shapeOperator.showInfo();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShapeOperator operator;
        System.out.println("Какую фигуру вы ходите построить: ");
        String answer = input.nextLine();
        if ("прямоугольник".equals(answer)) {
            operator = new RectangleOperator();
        } else {
            operator = new TriangleOperator();
        }
        Canvas canvas = new Canvas(operator);
        canvas.demonstrate();
    }
}
