package com.startjava.lesson_2_3.game;

public class Player {
    private String firstName;
    private int number1;
    private String secondName;
    private int number2;

    public Player (String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}