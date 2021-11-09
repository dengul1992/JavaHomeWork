package com.pb.Gulin.hw6;

import java.util.Objects;

public class Cat extends Animal {

    public String Claws;

    public Cat(String food, String location, String Claws) {
        super(food, location);
        this.Claws = Claws;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мур-мяу");;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    @Override
    public String toString() {
        return "Cat: Claws = " + Claws + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Claws == cat.Claws;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Claws);
    }
}
