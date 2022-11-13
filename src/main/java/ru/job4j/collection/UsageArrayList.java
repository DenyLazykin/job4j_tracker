package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {{
            add("Petr");
            add("Ivan");
            add("Stepan");
        }};
        for (String al : arrayList) {
            System.out.println(al);
        }
    }
}