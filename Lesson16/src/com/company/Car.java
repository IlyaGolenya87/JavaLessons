package com.company;

import java.io.Serializable;

public class Car implements Serializable {
    // все свойства класса являются сериализуемыми по умолчанию
    public String color;
    public int maxSpeed;
    // transient - делает свойства не сереализуемым
    public transient float volumeEngine;

   @Override
   public String toString () {
       return String.format("color:%s,max speed:%d,engine volume:%f",
               this.color, this.maxSpeed,this.volumeEngine);
   }
}
