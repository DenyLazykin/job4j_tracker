package ru.job4j.tracker;

import java.util.List;

/**
 * Класс из которого будем запускать приложение Tracker.
 * Описывает общее поведение системы
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /**
     * Инициализирует приложение и запускает выполнение различных пользовательских действий
     *
     * @param input   ввод пользователя
     * @param tracker объект Tracker
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неправильный ввод, вы можете выбрать от 0 до " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Выводит на экран меню доступных пользовательских действий
     */
    private void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ShowAllAction(output),
                new EditItemAction(output),
                new DeleteItemAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(input, tracker, actions);
    }
}
