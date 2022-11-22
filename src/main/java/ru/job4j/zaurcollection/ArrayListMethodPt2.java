package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodPt2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Den");
        arrayList.add("Nasty");
        arrayList.add("Ivan");
        arrayList.add(0, "Ivan");
        arrayList.add(0, "Ben");
        System.out.println(arrayList);
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Emma");
        arrayList1.add("Stan");
        arrayList1.add("Harry");
        arrayList1.add("Den");
        arrayList1.add("Nasty");
        System.out.println(arrayList1);
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        arrayList.retainAll(arrayList1);
        System.out.println(arrayList);
        boolean result = arrayList.containsAll(arrayList1);
        System.out.println(result);
        arrayList.toArray();
        System.out.println(arrayList1);
    }
}
