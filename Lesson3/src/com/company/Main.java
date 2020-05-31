package com.company;

public class Main {

    public static void main(String[] args) {
        // МАССИВЫ
        // массив - это именованая область памяти
        // в которой храниться несколько элементов
        // одного типа

 /*
        int [] hello = new int[5];
        hello [0] = 12;
        hello [1] = 23;
        hello [2] = hello [0] + hello [1];
        System.out.println(hello [0]);
        System.out.println(hello [1]);
        System.out.println(hello [2]);
        System.out.println(hello [3]);

*/

/*
        // задания inline (в линию) массива

        float [] arr2 = {12.0f, 13.0f, 14.78f};

        // в значении свойства length
        // хранится кол-во элементов массива

        System.out.println(arr2.length);



 */
/*
        // Многомерные массивы

        int [] [] arr3 = new int [3] [5];

        // 3 - кол-во строк
        // 5 - кол-во столбцов

        arr3 [1] [3] = 56;
 */
/*
        // Двумерный inline массив

        int  [] [] arr4 = {{1,2},{3,4},{5,6,8}};

        // 1.2
        //2.4
        //5,6,8

        arr4 [2] [2] = 9;


        // arr4 [0] [2] = 10; - ошибка

        System.out.println(arr4);
*/

        // ЦИКЛЫ

/*
        int x = 0;

        while (x < 12) {
            x = x + 1;
            System.out.println(x);


            // do....while - цикл с пост проверкой условия
        }

        do {
            System.out.println(x);
        } while (x < 5);

        // break - операция прерывает выполнения циклы
        // continue - прерывает текущую итерацию цикла

*/
        int[] arr5 = {12, 13, 50, 120, 9};
        int index = 0;
/*        while (index < arr5.length) {
            if (arr5[index] % 9 == 0) {
                System.out.println(arr5[index]);
                break;
            }
            index = index + 1;


        }
*/
/*        index = 0;
        while (index < arr5.length) {
            if (arr5[index] % 2 != 0) {
                index = index + 1;
                continue;
            }
            System.out.println(arr5[index]);
            index = index + 1;
        }
*/
        // 1. блок инициализация
        // 2. блок условия цикла  выполнения код {}
        // 3. блок поствыполнения
        // любой из 3-ъх блок не обязателен
        // for (;;) {...} - бесконечный цикл
        // <2b-> code->3b->2b->=>b2 == true

/*        for (int i = 0; i < arr5.length; i = i + 1) {
            System.out.println(arr5[i]);
        }

*/        // foreach
        for (int z : arr5) {
            if (z % 3 == 0) {
                System.out.println(z);
            }
        }

    }
}