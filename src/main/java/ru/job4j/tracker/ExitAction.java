package ru.job4j.tracker;

/**
 * Выход из меню
 */
public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("До скорых встреч");
        return false;
    }
}
