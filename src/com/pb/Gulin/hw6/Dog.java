package com.pb.Gulin.hw6;

import java.util.Objects;

public class Dog extends Animal {

    public int Fangs;

    public Dog(String food, String location, int Fangs) {
        super(food, location);
        this.Fangs = Fangs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Поглощаю пищу");
    }

    @Override
    public String toString() {
        return "Dog: Fangs = " + Fangs + "см., food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Fangs == dog.Fangs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Fangs);
    }
}