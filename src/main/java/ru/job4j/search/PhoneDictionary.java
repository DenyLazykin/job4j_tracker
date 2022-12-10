package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Модель справочника
 */
public class PhoneDictionary {
    private ArrayList<Person> personArrayList = new ArrayList<>();

    public void add(Person person) {
        this.personArrayList.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях
     * Осуществляем поиск по всем полям в классе Person через метод contains
     *
     * @param key ключ поиска
     * @return список пользователей, которые прошли проверку
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateName =  name -> name.getName().contains(key);
        Predicate<Person> predicateSurnameName = surname -> surname.getSurname().contains(key);
        Predicate<Person> predicatePhone = phone -> phone.getPhone().contains(key);
        Predicate<Person> predicateAddress = address -> address.getAddress().contains(key);
        var combiePredicate =
                (predicateName.or(predicateSurnameName).or(predicateAddress).or(predicatePhone));
        ArrayList<Person> result = new ArrayList<>();
        for (var person : personArrayList) {
            if (combiePredicate.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}