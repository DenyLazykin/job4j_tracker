package ru.job4j.tracker;

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
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Неправильный ввод, вы можете выбрать от 0 до " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Выводит на экран меню доступных пользовательских действий
     */
    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new EditItemAction(output),
                new DeleteItemAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output),
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
