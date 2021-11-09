package com.pb.Gulin.hw6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Animal[] animals = {
                new Cat("Сухой корм", "Днепр, ПриватБанк, 1эт. в Дельте", "Длинные и острые"),
                new Dog("Кости и мелкие животные", "Киев, Троещина", 10),
                new Horse("Сено", "Ипподром великих скакунов", "Мустанг")
        };

        Class veterinarianClazz = Class.forName("com.pb.Gulin.hw6.Veterinarian");
        Constructor con = veterinarianClazz.getConstructor(new Class[]{});
        Veterinarian objVeterinarian = (Veterinarian) con.newInstance();
        for (int i = 0; i < animals.length; i++) {
            objVeterinarian.treatAnimal(animals[i]);
        }
    }
}
