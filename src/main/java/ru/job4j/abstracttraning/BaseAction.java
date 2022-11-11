package ru.job4j.abstracttraning;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

public abstract class BaseAction {
    private final int key;
    private final String name;

    protected BaseAction(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s:%s", this.key, this.name);
    }
}
