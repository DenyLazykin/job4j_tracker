package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Сервис для проверки паспорта гражданина
 */
public class PassportOffice {
    private Map<String, Citizen> citizenMap = new HashMap<>();

    /**
     * Осуществляет вставку пасорта, перед этим проверяя его на уникальность
     *
     * @param citizen Данные гражданина
     * @return True, если пользователя еще нет в HashMap
     */
    public boolean add(Citizen citizen) {
        boolean result = false;
        if (!citizenMap.containsKey(citizen.getPassport())) {
            citizenMap.put(citizen.getPassport(), citizen);
            result = true;
        }
        return result;
    }

    /**
     * Для получения информации о гражданине по его паспорту
     *
     * @param passport Паспорт
     * @return Информацию о гражданние
     */
    public Citizen get(String passport) {
        return citizenMap.get(passport);
    }
}
