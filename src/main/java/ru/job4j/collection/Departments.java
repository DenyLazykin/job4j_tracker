package ru.job4j.collection;

import java.util.*;

/**
 * Класс для добавления пропущенных подразделений, и сортировки подразденелений
 */
public class Departments {
    /**
     * Метод для добавления пропущенных подразделений.
     * Вначале определяем, какие элементы отсутсвуют в системе.
     * Для этого каждую входящую строку разбиваем на одиночные элементы.
     * Церез цикл складываем элементы, и добавляем их в множество
     *
     * @param deps Список строк
     * @return Сформированный список
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += "".equals(start) ? el : "/" + el;
                temp.add(start);
            }
        }
        return new ArrayList<>(temp);
    }

    /**
     * Сортирует список строк по возрастанию
     *
     * @param orgs Список строк
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Сортирует список в соответствии с компаратором DepDescComp
     *
     * @param orgs Список строк
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
