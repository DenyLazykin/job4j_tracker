package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PredicateCheckEvenAndPositiveTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(22));
        assertFalse(PredicateCheckEvenAndPositive.check(-12));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}