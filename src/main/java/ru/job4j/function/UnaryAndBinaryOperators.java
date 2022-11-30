package ru.job4j.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperators {
    public static void main(String[] args) {
        UnaryOperator<StringBuilder> builderUnaryOperator = b -> b.reverse();
        System.out.println("Строка после реверса: " + builderUnaryOperator.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builderUnaryOperator.apply(new StringBuilder("tset rof gnirtS")));
        System.out.println();
        BinaryOperator<StringBuilder> stringBuilderBinaryOperator = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после обьединения: " + stringBuilderBinaryOperator.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
