package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // вызов метода
        int r = maltiply(8, 6);

        System.out.println(r);


        log("Hello");
        r = max(10, 30, 20);
        System.out.println(r);
        float c = 40;
        int[] arr = {10, -2, 37, 24};
        test(c, arr);
        System.out.println(c);
        System.out.println(arr[0]);

        // ввод с клавиатуры
        //   input ();
        sort(arr);
        for (int v : arr) {

            System.out.print(v);
            System.out.print(" ");

        }
        System.out.println();
        int s = sum(1,4,5,6,6,6);
        System.out.println(s);

        int f = fact1(5);
        System.out.println(f);
        f = fact2 (6);
        System.out.println(f);

    }


    // обьявления метода
    public static int maltiply(int a, int b) {
        int с = a * b;
        // return используется для возрватоа метода
        // из метода.
        // тип значения, который указываеться после слова return
        // должен совпадать с типом значения указанного при
        // обьявлении метода
        // return сразу завершает выполнение метода.
        return с;
    }

    //  в Java допустимо создание методов которые не возвращают
    //  значения.
    //  в этом случае, в качестве возвращаемого типа при обьявлении
    //  метода необходимо указать ключевое словов void
    //  наличи ключевого слова return - не обезательно

    public static void log(String log) {

        System.out.println(log);


    }


    public static int max(int x, int y, int z) {

        if (x > y && x > z) {
            return x;
        }
        if (y > z) {
            return y;
        }
        return z;
    }

    // при передачи в метод значений примитивного типа
    // значение копируется, а при передаче массивов или обьектов,
    // передаеться ссылка на эти аргументы

    public static void test(float a, int[] arr) {
        a = 12.7f;
        arr[0] = 10;
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println(data);
    }

    public static void sort(int[] arr) {
        for (int i=0; i<arr.length -1; i++ ){

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }

            }

        }

    }

    // в Java возможно создать метод который принимает на вход
    // переменные число параметров

    public static int sum (int ... a ) {
        int s = 0;
        for (int v:a) {
            s += v;
        }
        return s;

    }

    public static void test2 (int a, float b, byte ...с) {}

    // рекурсия
    public static int  fact1 (int n) {

        // 5! = 5*4*3*2*1 = 120
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        return f;

    }

    public static int  fact2 (int n) {

        if (n<=1) {
            return 1;


        }
        // 5*4*3*2*1
        return n*fact2 (n-1);
    }


    // int n = [0... 1000000000];
    // 2"n= ?


}