package ru.job4j.ex;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива"
                    + e);
        }
        System.out.println("После try/catch");
    }
}
