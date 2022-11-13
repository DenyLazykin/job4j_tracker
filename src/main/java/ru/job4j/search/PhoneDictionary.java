package ru.job4j.search;

import java.util.ArrayList;

/**
 * Модель справочника
 */
public class PhoneDictionary {
    private ArrayList<Person> people = new ArrayList<>();

    public void add(Person person) {
        this.people.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях
     * Осуществляем поиск по всем полям в классе Person через метод contains
     *
     * @param key ключ поиска
     * @return список пользователей, которые прошли проверку
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}