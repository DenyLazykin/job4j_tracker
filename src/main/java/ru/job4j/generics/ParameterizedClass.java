package ru.job4j.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> infoStr = new Info<>("Hi");
        System.out.println(infoStr);
        String s = infoStr.getValue();
        Info<Integer> infoInt = new Info<>(12);
        System.out.println(infoInt);
        Integer i = infoInt.getValue();
    }
}
