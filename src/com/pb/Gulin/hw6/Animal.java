package com.pb.Gulin.hw6;

public class Animal {
    public String food,location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public void eat(){
        System.out.println("Еда");
    }

    public void makeNoise(){
        System.out.println("Звук издаваемый довольным животным");
    }

    public void sleep(){
        System.out.println("Сплю...");
    }

}

