package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Den");
        arrayList.add("Nasty");
        arrayList.add("Ivan");
        arrayList.add(0, "Ivan");
        for (String s : arrayList) {
            System.out.println(s + " ");
        }
        System.out.println();
        System.out.println(arrayList.get(2));
        System.out.println();
        arrayList.set(3, "Katy");
        System.out.println(arrayList);
        System.out.println();
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
