package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String str : collection) {
            System.out.println(str);
        }
        Collection<String> list = new ArrayList<>();
        list.addAll(collection);
        for (String str : list) {
            System.out.println(list);
        }
        collection.remove("two");
        System.out.println("Вывод содержимого после удаления");
        for (String str : collection) {
            System.out.println(str);
        }
    }
}
