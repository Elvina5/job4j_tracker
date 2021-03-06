package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To1To6Then6() {
        int first = 5;
        int second = 1;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0To3To2Then3() {
        int first = 0;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To4To6Then6() {
        int first = 2;
        int second = 2;
        int third = 4;
        int four = 6;
        int result = Max.max(first, second, third, four);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}