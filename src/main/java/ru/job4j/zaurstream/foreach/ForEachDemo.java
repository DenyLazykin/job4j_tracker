package ru.job4j.zaurstream.foreach;

import java.util.Arrays;

/**
 * Проходит по всем элементам потока и выводит их на экран
 */
public class ForEachDemo {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
    }
}
