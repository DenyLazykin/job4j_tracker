package ru.job4j.ex;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перхвачено исключение: " + e);
        } finally {
            System.out.println("Этот блок выполняем в любом случае");
        }
    }
}
