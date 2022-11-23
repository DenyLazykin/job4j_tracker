package ru.job4j.zaurcollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1234, "Denis Lazykin");
        map.put(543, "Nasty Lazykina");
        map.put(1, "Ivan Boychenko");
        map.put(23, "Eldar Gazizov");
        map.putIfAbsent(23, "Rus Kachikaev");
        map.put(1, "Dmitriy Boychenko");
        System.out.println(map);
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsValue("Denis Lazykin"));
        System.out.println(map.containsValue("denis Lazykin"));
        System.out.println(map.containsKey(23));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
