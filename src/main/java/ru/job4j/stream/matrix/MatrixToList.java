package ru.job4j.stream.matrix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    /**
     * Преобразует матрицу в лист
     *
     * @param matrix Матрица массивов
     * @return Преобразованную в лист матрицу
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList()
                );
    }
}
