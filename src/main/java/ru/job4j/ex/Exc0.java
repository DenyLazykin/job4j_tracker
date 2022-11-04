package ru.job4j.ex;

public class Exc0 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Ты делишь на 0, так нельзя");
        }
        System.out.println("После оператора catch");
    }
}
