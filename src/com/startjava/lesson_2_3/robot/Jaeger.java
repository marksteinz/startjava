package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String name;
    private String origin;
    private float height;
    private float weight;

    public Jaeger (String name, String origin, float height, float weight){
        this.name = name;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public void run() {
        System.out.println("Бегу");
    }

    public String useWeapon() {
        return "Fire!";
    }

    public String toString() {
        return "Название[" + name + "] "
                + "Произведено: " + origin
                + " Высота: " + height
                + " Вес: " + weight;
    }
}