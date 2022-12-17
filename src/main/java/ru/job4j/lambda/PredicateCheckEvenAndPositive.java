package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Лямбда выражение, которое проверяет, что число четное и положительное.
 */
public class PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
        return check(integer -> integer > 0 && integer % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
