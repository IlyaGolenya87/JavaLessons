package com.company;

// в реализации интерфеса могут присутвовать только
// методы без реализации (без тела) и статические свойства
// объект интерфеса нельзя создать динамически.
public interface IAnimal {
    void goTo(String destination);
    void eat(String food);
    static int example = 23;
}
