package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThanLinearResult() {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> result = functionCalculator.diapason(5, 8, x -> 2.12 * x + 55.9);
        List<Double> expected = Arrays.asList(66.5, 68.62, 70.74);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThanLQuadraticResult() {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> result = functionCalculator.diapason(5, 8, x -> Math.pow(x, 2) - 1 * x - 2.4D);
        List<Double> expected = Arrays.asList(17.6, 27.6, 39.6);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenPowFunctionThanLPowResult() {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        List<Double> result = functionCalculator.diapason(5, 8, x -> Math.pow(3.5, x));
        List<Double> expected = Arrays.asList(525.21875, 1838.265625, 6433.9296875);
        assertThat(result).containsAll(expected);
    }
}