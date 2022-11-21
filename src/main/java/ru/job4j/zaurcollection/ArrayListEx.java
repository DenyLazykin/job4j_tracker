package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Den");
        arrayList.add("Nasty");
        arrayList.add("Ivan");
        arrayList.add("Ivan");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        List<String> listArray = new ArrayList<>(arrayList);
        System.out.println(listArray);
        System.out.println(arrayList == listArray);
    }
}
