package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public void printInfo() {
        System.out.println("Есть ошибка: " + active);
        System.out.println("Ее номер: " + status);
        System.out.println("Сообщение для пользователя: " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error414 = new Error(true, 414, "Слишком длинный URL");
        Error error404 = new Error(true, 404, "Файл не найден");
        Error noError = new Error();
        noError.printInfo();
        error404.printInfo();
        error414.printInfo();
    }
}
