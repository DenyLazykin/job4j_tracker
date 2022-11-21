package ru.job4j.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Den");
        list.add("Nasty");
        list.add("Ivan");
        System.out.println("Before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);
    }
}
