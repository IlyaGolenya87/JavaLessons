package com.company;

public class Main {

    public static void main(String[] args) {
        // Условный оператор if .... else
        // if (<логическое условие>) { code }
        // else { code }
        // >, <, >=, <=
        // == - знак равенство
        // != - не равно
        // && - оператор "и"
        // || - оператор "или"

        int a = 320;
        int b = 67;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<=b");
        }
        int age =  12;
        //  [0.12] - ребенок
        // [13, 20] - подросток
        // [21, inf ] - взрослый
        if (age >=12) {
            System.out.println("ребенок");
        } else {
            if (age > 20 ) {
                System.out.println("взрослый");
            }else{
                System.out.println("подросток");
            }
        }
        // условный оператор switch ... case
        int month  = 13;
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            default:
                // код, расположеный в блоке default
                // будет выполняться в том случае, если
                // не один из case-ов не был выполнен
                System.out.println("такого месяца нет!");

        }

        String s = "овен";
        switch (s) {
            case "овен":
                System.out.println("январь");
                break;

        }

        // % - оперделяет остаток от деления
        System.out.println( ); // 5 % 3 - 5/3 = 1 2/3
        int n = 535;
        if (n % 2 == 0) {
            System.out.println("четное");
        }else{
            System.out.println("нечетное");
        }

    }
}
