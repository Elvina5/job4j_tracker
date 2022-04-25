package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when564to486then3() {
        int expected = 3;
        Point a = new Point(5, 6, 4);
        Point b = new Point(4, 8, 6);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);

    }

    @Test
    public void when221012to161012then6() {
        int expected = 6;
        Point a = new Point(22, 10, 12);
        Point b = new Point(16, 10, 12);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);

    }
}