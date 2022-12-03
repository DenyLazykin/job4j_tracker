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

    public static void main(String[] args) {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> result = functionCalculator.diapason(5, 8, x -> Math.pow(3.13, x));
        System.out.println(result);
    }
}
