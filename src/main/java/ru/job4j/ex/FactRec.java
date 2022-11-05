package ru.job4j.ex;

public class FactRec {
    public static int calc(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return calc(number - 1) * number;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
