package ru.job4j.zaurstream.sorted;

import java.util.Arrays;

/**
 * Сортирует элементы
 */
public class SortedDemo {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 56, 2, 8, 9, 4, 13};
        array = Arrays
                .stream(array)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(array));
    }
}
