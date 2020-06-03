package com.company;

// 4 принципа ООП
// 1. инкапсуляция
// 2. полиморфизм
// 3. наследование
// 4. абстракция

public class Main {

    public static void main(String[] args) {
        // создание объекта
        Animal animal1 = new Animal();
        animal1.age = 12;
        animal1.legsCount = 4;
        animal1.sleep();
        animal1.eat("meat");
        animal1.sleep(23);
        Animal animal2 = new Animal();
        animal2.age = 13;

        Dog dog1 = new Dog();
        dog1.sleep(1);
        dog1.age = 17;
        dog1.voice();
        dog1.eat("123");
        dog1.weight = 12.6f;

        Dog dog2 = new Dog(1, 2.3f);
        System.out.println(dog2.age);
        System.out.println(dog2.weight);

        // 2 варианта обращения к статическому полю
        dog2.voice = "meow-meow";
        Dog.voice = "sound 2";

        workWithBinaryData();
    }

    public static void workWithBinaryData() {
        // В Java доступны 4 оператора
        // для работы с бинарными данными
        // & - бинарное и
        // | - бинарное или
        // >> - бинарный сдвиг вправо
        // << - бинарный сдвиг влево
        System.out.println(15 & 17); // = 1
        System.out.println(15 | 17); // = 31
        System.out.println(5 >> 2); // = 1
        System.out.println(5 << 2); // = 20

        // 1010101010 = 682
        // 3 (speed) = 5
        // 4-8 (voltage) = 32
        // 9-10 (temp) = 2
        int data = 682;
        int speed = data >> 7;
        int voltage = (data >> 2) & 37;
        int temp = data & 3;
        System.out.println(speed);
        System.out.println(voltage);
        System.out.println(temp);
    }
}
