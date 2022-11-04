package ru.job4j.ex;

public class ChainExDemo {
    static void demoProc() {
        NullPointerException exception =
                new NullPointerException("верхний уровень");
        exception.initCause(new ArithmeticException("причина"));
        throw exception;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
