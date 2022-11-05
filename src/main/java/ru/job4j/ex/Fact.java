package ru.job4j.ex;

public class Fact {
    public int calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть меньше нуля");
        }
        int rsl = 1;
        for (int i = 2; i <= number; i++) {
            rsl *= i;
            System.out.print(i + " ");
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(25);
    }
}
