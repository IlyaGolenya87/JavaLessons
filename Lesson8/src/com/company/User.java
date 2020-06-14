package com.company;


// в качестве типа для дженерика (обобщения)
// можно указывать только пользовательскии типы
// (class, не приметивного типа)
public class User <T,K> {


    public T id;
    public K age;
    public String name;
    public Day holiday;

    public Color interfaceColor;


    public <o> User (o data) {
        System.out.println(data);
    }

    public void  setId(T newId) {
        this.id=newId;

    }

public <V> void print (V[]items) {
        for (V item : items) {
            System.out.println(item);
        }

}

}
