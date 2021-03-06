package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        /*
        Год считается високосным если он либо кратен (делится без остатка) 4,
        но при этом не кратен 100, либо кратен 400.
         */
        /*
        если (year нацело(без остатка) делится на 400 или на 4 и при этом на 100 делится с остатком )
        вывести на экран("Год високосный");
        иначе вывести на экран("Год невисокосный");
        */

        short year = 2000;

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - " + "Год високосный");
        } else {
            System.out.println(year + " - " + "Год невисокосный");
        }

        // Task 2

        String s = "Овен";
        switch (s) {
            case "Овен":
                System.out.println(s + " " + "Много думают. Мало говорят. Мало делают.");
                break;
            case "Телец":
                System.out.println(s + " " + "Много думают обо всём. Убедительно говорят. Действуют без подготовки.");
                break;
            case "Близнецы":
                System.out.println(s + " " + "Думают больше о себе. Говорят, что думают. Думают, что делают всё очень хорошо.");
                break;
            case "Рак":
                System.out.println(s + " " + "Постоянно думают. Говорят очень мило и приятно. Делают то, что говорят.");
                break;
            case "Лев":
                System.out.println(s + " " + "Думают и анализируют. Слишком много говорят. Делают то, чего не могут избежать.");
                break;
            case "Дева":
                System.out.println(s + " " + "Думают одно. Говорят другое. Делают третье.");
                break;
            case "Весы":
                System.out.println(s + " " + "Думают слишком много. Говорят честно и открыто. Делают со всей ответственностью.");
                break;
            case "Скорпион":
                System.out.println(s + " " + "Думают сосредоточенно. Говорят правду. Делают то, что любят.");
                break;
            case "Стрелец":
                System.out.println(s + " " + "Никто не знает, о чем они думают. Говорят, что все, кроме них, плохие. Делают всё чужими руками.");
                break;
            case "Козерог":
                System.out.println(s + " " + "Думают, что придёт в голову. Говорят, что думают. Делают то, что знают.");
                break;
            case "Водолей":
                System.out.println(s + " " + "Думает: «Что вам всем нужно от меня?» Говорят: «Хорошо, если это необходимо». Делают лучше всех.");
                break;
            case "Рыбы":
                System.out.println(s + " " + "Думают, что никто ничего не знает. Говорят всегда мудро. Делают в зависимости от того, будут их проверять или нет.");
                break;
                default:
                System.out.println(s + " " + "Неверно указан знак задиака");


        }
    }
}