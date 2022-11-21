package ru.job4j.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(10);
        arrayListInt.add(20);
        arrayListInt.add(5);
        int i = GenMethod.getSecondElement(arrayListInt);
        System.out.println(i);
        ArrayList<String> arrayListStr = new ArrayList<>();
        arrayListStr.add("sad");
        arrayListStr.add("xcv");
        arrayListStr.add("cxb");
        String s = GenMethod.getSecondElement(arrayListStr);
        System.out.println(s);
    }
}
