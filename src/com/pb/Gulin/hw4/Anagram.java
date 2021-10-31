package com.pb.Gulin.hw4;
import java.util.Scanner;


public class Anagram {
    public static String wd(String line) {
        String LowerLine=line.toLowerCase();
        return LowerLine.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
    }

    public static String[] ToLowerArray(String line){
        String LowerLine=wd(line);
        return LowerLine.split("");
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String FirstLine, SecondLine;
        String [] FirstLineAr, SecondLineAr;
        boolean find=true;
        System.out.println("Тут мы проверим  будут ли 2 предложения анаграммой друг другу");

        System.out.println("Введите пожалуйста 1-е предложение");
        FirstLine= scan.nextLine();
        FirstLineAr=ToLowerArray(FirstLine);

        System.out.println("Введите пожалуйста 2-е предложение");
        SecondLine= scan.nextLine();
        SecondLineAr=ToLowerArray(SecondLine);
if (FirstLineAr.length==SecondLineAr.length){

        String search=wd(FirstLine);

        for (int i=0; i<FirstLineAr.length; i++) {
            if (!search.contains(SecondLineAr[i])){
                find = false;
                break;
            }
        }
        if (find) {
            System.out.println("Ура!) Вторая строка является анаграммой первой");
        } else {
            System.out.println("Нет, нет, нет - это не анаграмма");
        }
} else {
    System.out.println("Нет, нет, нет - это не анаграмма");
}
    }
}
