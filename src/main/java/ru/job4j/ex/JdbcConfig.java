package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url не может быть нулевым");
        }
    }

    public static void main(String[] args) {
        try {
            load("0");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
