package com.pb.Gulin.hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int x, max;
        int positive=0;
        int i=0;
        int sort=0;
        System.out.println("Введите пожалуйста целые числа для массива из 10 значений. Для завершения ввода введите что угодно кроме числа.");
        if (!scan.hasNextInt()) {
            System.out.println("Благодарю за уделенное время! Хорошего настроения!  ☺");
        } else{
        while (i < 10){
            System.out.println("Введите "+ (i+1) + " элемент массива");

             if (!scan.hasNextInt()) {
                 System.out.println("Благодарю за уделенное время! Хорошего настроения!  ☺");
                 break;
             } else
             {
                 x = scan.nextInt();
                 ar[i]=x;
                 i++;
            }
        }

        System.out.print("Введенный массив:");
        for (int k=0; k<ar.length; k++){
            System.out.print(" "+ar[k]+ " ");
        }
        System.out.println(" ");
        System.out.println("Количество элементов массива = "+ar.length+" \n Количество введеных элементов массива = "+ i);
        for (int k=0; k<ar.length; k++){
            if (ar[k]>0){
                positive++;
            }
        }
        System.out.println("Количество положительных элементов массива = "+positive);

        while (sort!=1){
            sort=1;
            for (int k = 0; k < ar.length-1; k++) {
                if (ar[k] > ar[k + 1]) {
                    sort = 0;

                    max = ar[k];
                    ar[k] = ar[k + 1];
                    ar[k + 1] = max;
                }
            }
        }
        System.out.println("Отсортированный массив выглядит так: "+Arrays.toString(ar));
    }
    }
}
