package ru.job4j.tracker;

/**
 * Валидация корректного воода пользователя
 * answers - массив строк
 * position - счетчик, чтобы при повторном вызове метода askStr
 * мы получали следующую ячейку из нашего массива
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
