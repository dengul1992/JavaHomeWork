package com.pb.Gulin.hw4;
import java.util.Scanner;
import java.util.Arrays;


public class CapitalLetter {
    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String w;
        System.out.println("Введите предложение и я переведу все первые буквы слов в верхний регистр) ...");
        w= scan.nextLine();
        String[] wArray = w.split("\\s");
        for (String human : wArray) {
            System.out.print(firstUpperCase(human)+" ");
        }
    }
    }

