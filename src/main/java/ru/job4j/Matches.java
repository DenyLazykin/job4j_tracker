package ru.job4j;

import java.util.Scanner;
/**
 * В классе имитируем игру 11 спичек.
 * Игрок берет по спичке, пока их не станет 03
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            count = count - matches;
            if (matches < 0 || matches >= 4) {
                System.out.println("Ошибка, Вы ввели число не из диапазона 1-3");
                count += matches;
                turn = !turn;
            }
            System.out.println("Осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
