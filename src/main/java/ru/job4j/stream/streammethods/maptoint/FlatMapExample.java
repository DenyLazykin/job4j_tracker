package ru.job4j.stream.streammethods.maptoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * (20) Запускаем поток, состоящий из 3 массивов.
 * (22) flatMapToInt() последовательно запускает поток из каждого массива исходящего потока,
 * в результате чего все элементы этих массивов объединяются в один общий поток примитивных чисел int.
 * (22) Так как примитивные числа - не объекты, поэтому для того,
 * что бы собрать их в лист наш поток элементов типа int, нужно обернуть в тип Integer.
 * Это можно сделать с помощью .boxed()
 */
public class FlatMapExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        List<Integer> list = Stream.of(array1, array2, array3)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .toList();
        System.out.println(list);
    }
}
