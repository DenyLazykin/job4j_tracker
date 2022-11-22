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
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("!!!");
        arrayList1.add("???");
        arrayList1.addAll(1, arrayList);
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList.indexOf("Ivan"));
        System.out.println(arrayList1.indexOf("???"));
        System.out.println(arrayList.lastIndexOf("Nasty"));
        System.out.println(arrayList.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Ivan"));
        System.out.println(arrayList.contains("Den"));
    }
}
