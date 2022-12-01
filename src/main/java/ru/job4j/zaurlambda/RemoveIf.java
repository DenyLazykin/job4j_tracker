package ru.job4j.zaurlambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Man");
        arrayList.add("I'm");
        arrayList.add("learning");
        arrayList.add("java");
        arrayList.removeIf(element -> element.length() > 5);
        System.out.println(arrayList);
    }
}
