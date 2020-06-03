package com.company;

// У родителя:
// private - не наследуется
// public - наследуется
// protected - наследуется,
// у потомка меняется на public

// Для классов (class) доступно всего 2 модификатора
// доступа: public и private
public class Dog extends Animal {
    private class Passport {
        public String breed; // порода
        public int ID;
    }

    public Passport pass;

    // поле, объявленное с модификатором static,
    // сохраняется в памяти в единственном экземпляре.
    public static String voice = "haw-haw";

    // конструктор по умолчанию
    public Dog() {
        System.out.println("dog was created");
        this.pass = new Passport();
    }

    public Dog(int age, float weight) {
        this.age = age;
        this.weight = weight;
        this.pass = new Passport();
    }

    public void voice() {
        System.out.println("haw-haw");
    }

    // переопределение метода
    @Override
    public void eat(String food) {
        System.out.println("dog eat " + food);
    }
}
