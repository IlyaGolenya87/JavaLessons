package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // "r" - открытие файла для чтение
        // "w" - открытие файлв нв запись
        // "rw" - открытие файла на чтение и на запись
        try {
            RandomAccessFile rf = new RandomAccessFile ("1.txt", "rw");
            // метод -перемещает куррор чтение в заданую позицию в файле
            rf.seek(6);
            String s = "";
            while (true) {
                int c = rf.read();
                if (c == - 1) {
                    break;
                }
                s += (char)c;
                //System.out.print((char)c);
            }

            s = new String(s.getBytes( Charset.forName("ISO-8859-1")),
                    Charset.forName("UTF-8"));
            System.out.println(s);

            rf.seek(3);
            rf.write("hello" .getBytes(Charset.forName("UTF-8")));

            rf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Сериализация обьекта
        Car cl = new Car ();
        cl.color="red";
        cl.volumeEngine = 3.6F;
        cl.maxSpeed = 200;
        ArrayList <User> user = new ArrayList ();
        user.add(new User("Vasya"));
        user.add(new User("Petya"));
        user.add(new User("Gena"));
        user.add(new User("Kolya"));


        try {
            FileOutputStream fos = new FileOutputStream ("date.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(cl);
            ous.writeObject(user);
            ous.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // Десереализация обьекта

        try {
            FileInputStream fis = new FileInputStream("date.bin");
            ObjectInputStream ois = new  ObjectInputStream (fis);
            Car c2 = (Car)ois.readObject();
            ArrayList <User> user1 = (ArrayList <User>) ois.readObject();
            for (User u : user1)
                System.out.println(c2);
            ois.close();
            System.out.println(c2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
