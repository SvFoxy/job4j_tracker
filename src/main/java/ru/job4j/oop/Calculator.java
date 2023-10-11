package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rls1 = minus(10);
        System.out.println("minus(10) " + rls1);
        int rls2 = calculator.divide(15);
        System.out.println("divide(15) " + rls2);
        int rls3 = calculator.sumAllOperation(20);
        System.out.println("sumAllOperation(20) " + rls3);
    }
}