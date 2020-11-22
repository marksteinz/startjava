package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main (String[] args) {
        Jaeger jaeger = new Jaeger("Cherno Alpha",
                "Russia", 85.3f,2.4f);

        System.out.println(jaeger);
        jaeger.run();
        System.out.println(jaeger.useWeapon());
    }
}