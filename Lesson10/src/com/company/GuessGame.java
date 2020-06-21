package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int count;
    private int number;

    public GuessGame () {
        // генерируем случайное число
        Random r = new Random();
        this.number = r.nextInt(101);

    }

    public int startGame () {


        while (true) {
            Scanner sc = new Scanner(System.in);
            this.count++;
            System.out.println("Введите число: ");
            int d = 0;
            try {
                d = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("неверный ввод!");
                continue;
            }
            if (d < this.number) {
                System.out.println("загаданное число больше");
                continue;
            }

            if (d>this.number) {
                System.out.println("загаданное число меньше");
                continue;
            }
            System.out.println("Вы угодали!");
            break;
        }
        return this.count;
    }


}
