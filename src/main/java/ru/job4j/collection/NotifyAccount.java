package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    /**
     * Для отправки уникальных писем
     * Преобразуем List из аргумента метода в Set
     *
     * @param accounts Список получателей
     * @return Отсортированную без дубликатов коллекцию
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}
