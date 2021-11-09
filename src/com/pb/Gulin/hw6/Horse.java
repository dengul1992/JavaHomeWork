package com.pb.Gulin.hw6;

import java.util.Objects;

public class Horse extends Animal {

    public String Breed;

    public Horse(String food, String location, String Breed){
        super(food, location);
        this.Breed = Breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("И-го-го!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating.");
    }
    @Override
    public String toString() {
        return "Horse: Breed = " + Breed + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(Breed, horse.Breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Breed);
    }
}
