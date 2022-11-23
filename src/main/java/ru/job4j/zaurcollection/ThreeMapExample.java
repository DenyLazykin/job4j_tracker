package ru.job4j.zaurcollection;

import java.util.TreeMap;

public class ThreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, StudentHashCode> threeMap = new TreeMap<>();
        StudentHashCode studentHashCodeDen = new StudentHashCode("Den", "Lazykin", 4);
        StudentHashCode studentHashCodeNasty = new StudentHashCode("Nasty", "Lazykina", 1);
        StudentHashCode studentHashCodeIvan = new StudentHashCode("Ivan", "Boychenko", 5);
        StudentHashCode studentHashCodeRus = new StudentHashCode("Rus", "Kachikaev", 2);
        StudentHashCode studentHashCodeEldar = new StudentHashCode("Eldar", "Gazizov", 3);
        StudentHashCode studentHashCodeElena = new StudentHashCode("Elena", "Kachikaeva", 5);
        StudentHashCode studentHashCodeKaty = new StudentHashCode("Katy", "Boychenko", 5);
        threeMap.put(9.9, studentHashCodeElena);
        threeMap.put(10D, studentHashCodeDen);
        threeMap.put(2.1, studentHashCodeKaty);
        threeMap.put(5.8, studentHashCodeIvan);
        threeMap.put(8.4, studentHashCodeEldar);
        threeMap.put(6.3, studentHashCodeNasty);
        threeMap.put(4.1, studentHashCodeRus);
        System.out.println(threeMap);
        System.out.println(threeMap.get(10D));
        System.out.println(threeMap.remove(9.9));
        System.out.println(threeMap);
        System.out.println(threeMap.descendingMap());
        System.out.println(threeMap.tailMap(7.3));
        System.out.println(threeMap.headMap(6D));
        System.out.println(threeMap.lastEntry());
        System.out.println(threeMap.firstEntry());
    }
}
