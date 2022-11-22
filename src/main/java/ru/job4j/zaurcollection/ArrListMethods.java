package ru.job4j.zaurcollection;

import java.util.Arrays;
import java.util.List;

public class ArrListMethods {
    public static void main(String[] args) {
        StringBuilder stringBuilderA = new StringBuilder("A");
        StringBuilder stringBuilderB = new StringBuilder("B");
        StringBuilder stringBuilderC = new StringBuilder("C");
        StringBuilder stringBuilderD = new StringBuilder("D");
        StringBuilder[] array = {
                stringBuilderA,
                stringBuilderB,
                stringBuilderC,
                stringBuilderD
        };
        List<StringBuilder> stringBuilders = Arrays.asList(array);
        System.out.println(stringBuilders);
        array[0].append("!!!");
        array[1] = new StringBuilder("F");
        System.out.println(stringBuilders);
    }
}
