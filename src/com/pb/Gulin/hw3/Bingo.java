package com.pb.Gulin.hw3;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, r;
        String new_game;
        r = (int) (Math.random() * 101);


//        System.out.println("Случайное число: " + r);
        System.out.println("Добро пожаловать в игру Бинго! \n Правила просты: я загадываю число от 0 до 100, а Вы угадываете его.\n Если введеное значение отличается, то я подскажу, мое число больше или меньше Вашего \n Если захотите закончить игру введите что угодно кроме числа");
        System.out.println("Я уже загадал целое число в интервале от 0 до 100, попробуйте угадать какое:");
        do {
            if (!scan.hasNextInt()) {
                System.out.println("Благодарю за игру, всего доброго!");
                break;
            } else {
                 x = scan.nextInt();
                if (x<0 || x>100) {
                    System.out.println("угадывая, вводите пожуйста число в диапазоне от 0 до 100");
                } else {
                        if (r > x) {
                            System.out.println("играем дальше, мое число больше Вашего ");
                        } else if (r < x){
                            System.out.println("играем дальше, мое число меньше Вашего ");
                        } else {
                            System.out.println("Поздравляю! \n Вы угадали загаданное число *салют* \n");
                            System.out.println("Если хотите сыграть заново введите \"Y\" или что угодно для завершения игры");
                            new_game= scan.next();
                            if (new_game.equals("Y") || new_game.equals("y")) {
                                r = (int) (Math.random() * 101);
                                System.out.println("Отлично!) \n Загадал новое целое число в интервале от 0 до 100, попробуйте угадать:");
                                continue;
                            } else {
                                System.out.println("Благодарю за игру! Хорошего настроения!  ☺");
                            }
                            }
                        }
                    }
        } while (x!=r);

    }
}