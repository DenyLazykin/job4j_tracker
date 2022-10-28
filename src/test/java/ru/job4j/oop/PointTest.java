package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double expected = 0;
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4114to2332then25dot45() {
        Point a = new Point(41, 14);
        Point b = new Point(23, 32);
        double expected = 25.45;
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, 0.01);
    }
}