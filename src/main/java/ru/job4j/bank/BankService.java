package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Логика работы банка
 * Поле users - соодержит всех пользователей системы с привязанными к ним счетами
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет пользователя в систему
     * putIfAbsent - добавляет пару в мапу, если ее там нет
     *
     * @param user Пользователя
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаляет пользователя из системы
     *
     * @param passport Паспорт
     * @return True - если пользователь удален
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, null)) != null;
    }

    public void addAccount(String passport, Account account) {

    }

    public User findByPassport(String passport) {

    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
