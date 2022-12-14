package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    /**
     * Считает функцию в диапазоне, задаваемом в параметре метода
     *
     * @param start    Начальное значение
     * @param end      Конечное значение
     * @param function Функциональный интерфейс для рачетов
     * @return Список с результатом вычислений
     */
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        for (double i = start; i < end; i++) {
            list.add(function.apply(i));
        }
        return list;
    }
}
