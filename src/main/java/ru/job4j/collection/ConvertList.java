package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    /**
     * Метод преобразует список с массивом чисел в список чисел
     *
     * @param list список с массивом чисел
     * @return преобразованный список
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}