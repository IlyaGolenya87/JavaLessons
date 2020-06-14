package com.company;

public class Main {

    public static void main(String[] args) {

        User<String, Integer> u = new User<>(12);
        u.id = "some id";
        u.setId("2");
        u.age = 78;
        Integer i = 12;
        int b = i + 12;
        User<Integer, Float> u2 = new User<>("df");
        u2.id = 12;
        u2.setId(13);
        u2.age = 45.8F;
        System.out.println(u.id);
        System.out.println(u2.id);
        String[] items = {"word1", "word2", "word3"};
        u.print(items);

        // пример использования wildcards
        // ?super <someClass> - можно использовать класс,
        // который наследуется от класса someClass.
        User<? super Number, Float> u3 = new User<>(67);
        Integer i1 = 12;
        u3.id = i1;
        Double i2 = 12.89;
        u3.id = i2;

        // ? extends someClass - можно использовать класс,
        // который является наследником по отношению к классу
        // someClass (subclass)
        User<Integer, ? extends Animal> u4 = new User<>(10);
//        u4.age= new Object();


        // ENUMS
        u.holiday = Day.Saturday;
        System.out.println(Day.Saturday.ordinal());
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);

        }


        // valueOf преобразует строковое название
        // обьекта перечисление к обьекту перечисления
        Day saturday = Day.valueOf("Saturday");
        //   System.out.println(saturday.ordinal ());

        u.interfaceColor = Color.Red;
        System.out.println(Color.Red.getCode());

        float res = Calc.DIVISION.action(12,4);
System.out.println(res);

// перевод строки в число.
String s = "12234";
int  number = Integer.valueOf(s);
System.out.println(number);

}
}
