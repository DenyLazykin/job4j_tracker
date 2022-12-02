package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLoading {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Den"};
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);
    }
}
