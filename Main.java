package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // абсолютный путь - полный путь к файлу
        // C:\Windows\hello.txt
        //
        // относительный путь - путь относительно
        // расположения исполняемого файла

        File f = new File("1.txt ");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

        File dir = new File("data/text");
        if (!dir.exists()) {
            // mkdir() - создает первую несущестующую папку в иерархии
            // mkdirs() - создает полную иерархию папкок

            dir.mkdirs();
        }
        long lm = f.lastModified();
        Date d = new Date();
        d.setTime(lm);
        System.out.println(d);
       // f.setLastModified();
       if (f.isHidden()) {
           System.out.println("файл скрыт");
       }

       if(f.canRead()) {}

       if (f.canWrite()) {}

       if (f.canExecute()) {}

       if (f.isFile()) {}

       if (f.isDirectory()) {}

       File dir2 = new File ("D:\\");
       File [] files = dir2.listFiles();
       for (File ff : files) {
           if (ff.isHidden()) {


               System.out.println(ff.getName());

               System.out.println(ff.getPath());

               System.out.println(ff.getAbsolutePath());
           }

       }

      // f.delete();
      // f.deleteOnExit();

       f.renameTo(new File("2.cvfdfdfdf"));


    }
}
