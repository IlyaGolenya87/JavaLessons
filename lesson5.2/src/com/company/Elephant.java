package com.company;

import java.io.IOException;
import java.io.Serializable;
import java.nio.CharBuffer;

// в Java допустима множественная имплементация
// интерфесов
public class Elephant extends Animal implements IAnimal, Serializable, Readable {
    @Override
    public void voice() {
       System.out.println("uuuuuuu");
    }

    @Override
    public void goTo(String destination) {

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
