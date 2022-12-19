package ru.job4j.lambda;

import java.util.function.Function;

/**
 * В этом упражнения Вам нужно выразить формулу квадратного уравнения в виде лямбды.
 * y = x^2 + 2x + 1
 */
public class FunctionFormula {
    public static double calculate(double x) {
        return calculate(n -> ((n * n) + (2 * n) + 1), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
