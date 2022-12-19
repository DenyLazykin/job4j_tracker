package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Лямбда выражение, которое извлекает корень квадратный из числа
 */
public class FunctionSqrt {
    public static double calculate(double x) {
        return calculate(n -> Math.sqrt(n), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
