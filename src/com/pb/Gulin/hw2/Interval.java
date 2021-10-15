package com.pb.Gulin.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner scan= new Scanner (System.in);
        System.out.println("Введите целое значение в интервале от 0 до 100:");
        x= scan.nextInt();
        if (x>=0 && x<=100){
        if (x<=14) {
            System.out.println("Введенное значение находится в интервале от 0 до 14");
        } else if(x<=35){
            System.out.println("Введенное значение находится в интервале от 15 до 35");
        } else if(x<=50){
            System.out.println("Введенное значение находится в интервале от 36 до 50");
        }else if(x<=100){
            System.out.println("Введенное значение находится в интервале от 51 до 100");
        }
        } else {
            System.out.println("Введенное значение НЕ находится в интервале от 0 до 100");
        }

    }
}
