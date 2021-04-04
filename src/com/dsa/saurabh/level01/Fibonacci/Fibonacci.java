package com.dsa.saurabh.level01.Fibonacci;

public class Fibonacci {


    private int fibonacci(int n) {
        if (n <= 0) return 0;

        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long[] cache = new long[51];
        long number = fibonacci.fibonacci(5);
        System.out.println("the fibonacci number is : " + number);
    }
}
