package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// чтение данных из файла
        FileReader fr = null;
        try {
            fr = new FileReader ("1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int c = 0 ;
            String s = "";
            while (true) {
                c = fr.read();
                if (c == -1) {
                    break;
                }
                if ( c != '\n' && c != '\r') {
                    s += (char) c;
                }
                // \t - табуляция
                // \n - символ новой строки
            }
            System.out.println(s);


            //!!!! НЕ ЗАКРЫВАТЬ ФАЙЛ
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // запись в файл

        try {
            FileWriter fw = new FileWriter("2.txt", true);
            fw.write("\tHello\nJava");
            fw.write("\nHi!");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        // чтение данных из файла с использование буфера
        try {
            FileReader fr2 = new FileReader("2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //HW

        FileReader fr try {
            3 = new FileReader ("3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}

