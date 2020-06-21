package com.company;

public class Main {

    public static void main(String[] args) {
        // Guess Game
        GuessGame game = new GuessGame();
        int count = game.startGame();
        System.out.print("Попыток зпатраченно: ");
        System.out.print(count);


    }
}
