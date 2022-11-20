package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSort {
    public static void main(String[] args) {
        Set<Integer> numbersNaturalSort = new TreeSet<>();
        numbersNaturalSort.add(4);
        numbersNaturalSort.add(3);
        numbersNaturalSort.add(1);
        System.out.println(numbersNaturalSort);
        Set<Integer> numberReversedSort = new TreeSet<>(Collections.reverseOrder());
        numberReversedSort.add(3);
        numberReversedSort.add(1);
        numberReversedSort.add(7);
        System.out.println(numberReversedSort);
    }
}
