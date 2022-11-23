package ru.job4j.zaurcollection;

import java.util.HashMap;
import java.util.Map;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<StudentHashCode, Double> map = new HashMap<>();
        StudentHashCode studentHashCodeDen = new StudentHashCode("Den", "Lazykin", 4);
        StudentHashCode studentHashCodeNasty = new StudentHashCode("Nasty", "Lazykina", 1);
        StudentHashCode studentHashCodeIvan = new StudentHashCode("Ivan", "Boychenko", 5);
        map.put(studentHashCodeDen, 10D);
        map.put(studentHashCodeNasty, 2.2);
        map.put(studentHashCodeIvan, 5.4);
        System.out.println(map);
        StudentHashCode studentHashCodeDen2 = new StudentHashCode("Den", "Lazykin", 4);
        boolean result = map.containsKey(studentHashCodeDen2);
        System.out.println("result = " + result);
        System.out.println(studentHashCodeDen.hashCode());
        System.out.println(studentHashCodeDen2.hashCode());
        for (Map.Entry<StudentHashCode, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
