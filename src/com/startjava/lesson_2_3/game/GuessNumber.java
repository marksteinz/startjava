package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Player player = new Player("Player 1", "Player 2");

    int computer = random.nextInt(100);

    public void game() {

        System.out.println("Запуск игры!");

        System.out.println(player.getFirstName() + " введите ваш новый ник нейм.");
        String firstNickName = scanner.nextLine();

        System.out.println(player.getSecondName() + " введите ваш новый ник нейм.");
        String secondNickName = scanner.nextLine();

        System.out.println(firstNickName + " и " + secondNickName + " игра началась!");

        while (true) {
            System.out.println(firstNickName + " введите число");
            int number1 = scanner.nextInt();
            player.setNumber1(number1);

            System.out.println(secondNickName + " введите число");
            int number2 = scanner.nextInt();
            player.setNumber2(number2);

            if (number1 == computer && number2 == computer) {
                System.out.println("Вы оба ввели " + number1 + " совпадает с тем, что загадал компьютер");
                break;
            }
            if (number1 < computer) {
                System.out.println(firstNickName + " введенное вами число " + number1 + " меньше того, что загадал компьютер.");
            }
            if (number1 > computer) {
                System.out.println(firstNickName + " введенное вами число " + number1 + " больше того, что загадал компьютер.");
            }
            if (number1 == computer) {
                System.out.println(firstNickName + " введенное вами число " + number1 + " совпадает с тем, что загадал компьютер!");
                break;
            }
            if (number2 < computer) {
                System.out.println(secondNickName + " введенное вами число " + number2 + " меньше того, что загадал компьютер");
            }
            if (number2 > computer) {
                System.out.println(secondNickName + " введенное вами число " + number2 + " больше того, что загадал компьютер");
            }
            if (number2 == computer) {
                System.out.println(secondNickName + " введенное вами число " + number2 + " совпадает с тем, что загадал компьютер");
                break;
            }
        }
    }
}