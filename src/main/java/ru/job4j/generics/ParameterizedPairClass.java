package ru.job4j.generics;

public class ParameterizedPairClass {
    public static void main(String[] args) {
        Pair<String, Integer> pairStrInt = new Pair<>("privet", 21);
        System.out.println("Value1 = " + pairStrInt.getValue1() + ", value2 = " + pairStrInt.getValue2());
        Pair<Integer, Double> pairIntDouble = new Pair<>(100, 22.2D);
        System.out.println("Value1 = " + pairIntDouble.getValue1() + ", value2 = " + pairIntDouble.getValue2());
    }
}
