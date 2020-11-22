package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;

        char sign = '/';

        if (sign == '+') {
            System.out.println(a + b);

        } else if (sign == '-') {
            System.out.println(a - b);

        } else if (sign == '*') {
            System.out.println(a * b);

        } else if (sign == '^') {
            int degree = 3;
            int result = 1;
                for (int i = 0; i < degree; i++) {
                    result = result * a;
            }
                System.out.println(result);

        } else if (sign == '%') {
            System.out.println(a % b);

        } else if (sign == '/') {
            System.out.println(a / b);
        }
    }
}
