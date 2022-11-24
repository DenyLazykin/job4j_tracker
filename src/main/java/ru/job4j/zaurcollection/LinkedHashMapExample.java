package ru.job4j.zaurcollection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, StudentHashCode> linkedHashMap = new LinkedHashMap<>(16, 0.75F, true);
        StudentHashCode studentHashCodeDen = new StudentHashCode("Den", "Lazykin", 4);
        StudentHashCode studentHashCodeNasty = new StudentHashCode("Nasty", "Lazykina", 1);
        StudentHashCode studentHashCodeIvan = new StudentHashCode("Ivan", "Boychenko", 5);
        StudentHashCode studentHashCodeRus = new StudentHashCode("Rus", "Kachikaev", 2);
        linkedHashMap.put(9.9, studentHashCodeDen);
        linkedHashMap.put(10D, studentHashCodeNasty);
        linkedHashMap.put(2.1, studentHashCodeIvan);
        linkedHashMap.put(5.8, studentHashCodeRus);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(10D));
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap);
    }
}
