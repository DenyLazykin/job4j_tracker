package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> mapKeyOnly = new HashMap<>() {{
            put("dzaka89@gmail.com", "Denis Lazykin");
        }};
        for (String key : mapKeyOnly.keySet()) {
            String value = mapKeyOnly.get(key);
            System.out.println(key + " = " + value);
        }
        HashMap<String, String> mapKeyValue = new HashMap<>() {{
            put("agordeeva@gmail.com", "Anastasia Lazykina");
            put("agordeeva@yandex.ru", "Anastasia Lazykina");
        }};
        for (Map.Entry<String, String> entry : mapKeyValue.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        mapKeyOnly.put("dzaka89@gmail.com", "Lazykin Denny");
        mapKeyValue.remove("agordeeva@gmail.com");
        for (String key : mapKeyOnly.keySet()) {
            String value = mapKeyOnly.get(key);
            System.out.println("Замена - " + key + " = " + value);
        }
        for (String key : mapKeyValue.keySet()) {
            String value = mapKeyValue.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
