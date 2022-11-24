package ru.job4j.zaurcollection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(10);
        System.out.println(linkedHashSet.contains(8));
        System.out.println(linkedHashSet.contains(10));
    }
}
