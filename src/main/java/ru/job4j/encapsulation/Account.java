package ru.job4j.encapsulation;

/**
 * Класс, для хранения ифно о счете клиента
 */
public class Account {
    private int balance;

    /**
     * Для пополнения счета
     * @param money сколько денег положить на счет
     */
    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
