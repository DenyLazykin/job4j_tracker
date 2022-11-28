package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сравнить первые элементы по убыванию, если они равны, то сравнить последующие элементы, но в возрастающем порядке.
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String first = o1.split("/")[0];
        String second = o2.split("/")[0];
        int result = second.compareTo(first);
        return result != 0 ? result : o1.compareTo(o2);
    }
}
