package ru.job4j.tracker;

/**
 * КОнсольный ввод
 */
public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
