package ru.job4j.zaurcollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Den");
        set.add("Nasty");
        set.add("Ivan");
        set.add("Eldar");
        System.out.println(set);
        set.remove("Den");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Den"));
        System.out.println(set.contains("Ivan"));
        HashSet<Integer> hashSetIntegerFirst = new HashSet<>();
        hashSetIntegerFirst.add(5);
        hashSetIntegerFirst.add(2);
        hashSetIntegerFirst.add(3);
        hashSetIntegerFirst.add(1);
        hashSetIntegerFirst.add(8);
        HashSet<Integer> hashSetIntegerSecond = new HashSet<>();
        hashSetIntegerSecond.add(7);
        hashSetIntegerSecond.add(4);
        hashSetIntegerSecond.add(3);
        hashSetIntegerSecond.add(5);
        hashSetIntegerSecond.add(8);
        System.out.println(hashSetIntegerFirst);
        System.out.println(hashSetIntegerSecond);
        HashSet<Integer> union = new HashSet<>(hashSetIntegerFirst);
        union.addAll(hashSetIntegerSecond);
        System.out.println(hashSetIntegerFirst);
        System.out.println(hashSetIntegerSecond);
        System.out.println("В результате объединения коллекций hashSetIntegerFirst + hashSetIntegerSecond "
                + union);
        HashSet<Integer> intersect = new HashSet<>(hashSetIntegerFirst);
        intersect.retainAll(hashSetIntegerSecond);
        System.out.println("Показываю одинаковые элементы из коллекций hashSetIntegerFirst + hashSetIntegerSecond "
                + intersect);
        HashSet<Integer> subtract = new HashSet<>(hashSetIntegerFirst);
        subtract.removeAll(hashSetIntegerSecond);
        System.out.println("Элементы, которые есть в hashSetIntegerFirst, но нет в hashSetIntegerSecond "
                + subtract);
    }
}
