package ru.job4j.oop;

public class Ball {
    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public void tryRun(boolean condition) {
        if (!condition) {
            System.out.println("Колобок сбежал");
        } else {
            System.out.println("Колобок съеден");
        }
    }
}
