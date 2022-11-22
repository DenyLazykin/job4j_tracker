package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Den");
        arrayList.add("Nasty");
        arrayList.add("Ivan");
        arrayList.add(0, "Ivan");
        arrayList.add(0, "Ben");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println(arrayList);
        }
    }
}
