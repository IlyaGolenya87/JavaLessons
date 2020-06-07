package com.company;

// в Java невозможно создать объект
// абстрактного класса
public abstract class Animal implements IAnimal {
    static int count;

    public Animal() {
        count++;
    }

    // абстактный метод не должен иметь реализации ({})
    // и обязательно должен быть переопределен в
    // дочернем не абстрактном классе
    public abstract void voice();

    public void sleep() {
        System.out.println("z-z-z-z-z");
    }
}
