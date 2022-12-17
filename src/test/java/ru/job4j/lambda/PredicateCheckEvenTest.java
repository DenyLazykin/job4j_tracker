package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}