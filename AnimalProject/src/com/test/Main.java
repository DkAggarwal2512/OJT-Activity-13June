package com.test;

import com.animals.Animal;
import com.animals.Dog;
import com.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
