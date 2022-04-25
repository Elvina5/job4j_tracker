package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int total) {
        return sum(total) + multiply(total) + minus(total) + divide(total);
    }

    public static void main(String[] args) {
        int rslSum = Calculator.sum(10);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        int rslMinus = Calculator.minus(16);
        int rslDivide = calculator.divide(30);
        int rslSumAllOperation = calculator.sumAllOperation(5);
        System.out.println(rslSum);
        System.out.println(rslMultiply);
        System.out.println(rslMinus);
        System.out.println(rslDivide);
        System.out.println(rslSumAllOperation);
    }
}