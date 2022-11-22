package ru.job4j.zaurcollection;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = {
                -12, 2, 54, -3, 43, 150, 99, -23, 43
        };
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int i = Arrays.binarySearch(array, 99);
        System.out.println(i);
    }
}
