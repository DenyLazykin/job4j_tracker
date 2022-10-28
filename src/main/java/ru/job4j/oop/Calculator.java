package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third));
    }

    public static int sum(int num) {
        return x + num;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int multiply(int num) {
        return x * num;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + minus(num) + multiply(num) + divide(num);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = sum(10);
        System.out.println(resultSum);
        int resultMinus = minus(10);
        System.out.println(resultMinus);
        int resultMultiply = calculator.multiply(10);
        System.out.println(resultMultiply);
        int resultDivide = calculator.divide(10);
        System.out.println(resultDivide);
        int resultSumAllOperations = calculator.sumAllOperation(10);
        System.out.println(resultSumAllOperations);
    }
}
