package ru.job4j.tracker;

/**
 * Выход из меню
 */
public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("До скорых встреч");
        return false;
    }
}
