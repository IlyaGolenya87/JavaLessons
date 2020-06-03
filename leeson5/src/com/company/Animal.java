package com.company;

// Модификаторы доступа
// public - поле открыто (доступно извне)
// private - поле закрыто (недоступно извне)
// protected - поле закрыто
// по умолчанию, каждое поле класса имеет модификатор доступа
// self-protected (package-protected)

public class Animal {
    public int age;
    public int legsCount;
    protected float weight;

    public void sleep() {
        System.out.println("Z-z-z-z");
    }

    // перегрузка метода sleep
    public void sleep(int h) {
        System.out.println("Z-z-z-z " + h + " hours");
    }

    public void eat(String food) {
        System.out.println("animal eat " + food);
    }
}
