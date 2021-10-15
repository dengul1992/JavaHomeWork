package com.pb.Gulin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x,y;
        String symbol;
        Scanner scan= new Scanner (System.in);
        System.out.println("Введите целое значение operand1:");
        x= scan.nextInt();

        System.out.println("Введите целое значение operand2:");
        y= scan.nextInt();

        System.out.println("Введите математический оператор : +, -, *, /");
        symbol= scan.next();
        if (symbol.equals("+")  || symbol.equals("-")  || symbol.equals("*")  || symbol.equals("/") ) {
            switch (symbol) {
                case ("+"): {
//                    System.out.println("x + y = "+ (x+y));
                    System.out.println(x +" + "+ y +" = "+ (x+y));
                    break;
                }
                case ("-"): {
//                    System.out.println("x - y = "+ (x-y));
                    System.out.println(x +" - "+ y +" = "+ (x-y));
                    break;
                }
                case ("*"): {
//                    System.out.println("x * y = "+ (x*y));
                    System.out.println(x +" * "+ y +" = "+ (x*y));
                    break;
                }
                case ("/"): {
//                    System.out.println("x / y = " + (x/y));
                    if (y==0){
                        System.out.println(" На 0 делить нельзя!");
                    } else {
                        System.out.println(x +" / "+ y +" = "+ (x/y));
                    }
                    break;
                }
            }
        } else {
            System.out.println("Не корректный оператор. Введите оператор из предложенных : +, -, *, /");
            symbol= scan.next();
            if (symbol.equals("+")  || symbol.equals("-")  || symbol.equals("*")  || symbol.equals("/")) {
                switch (symbol) {
                    case ("+"): {
//                    System.out.println("x + y = "+ (x+y));
                        System.out.println(x +" + "+ y +" = "+ (x+y));
                        break;
                    }
                    case ("-"): {
//                    System.out.println("x - y = "+ (x-y));
                        System.out.println(x +" - "+ y +" = "+ (x-y));
                        break;
                    }
                    case ("*"): {
//                    System.out.println("x * y = "+ (x*y));
                        System.out.println(x +" * "+ y +" = "+ (x*y));
                        break;
                    }
                    case ("/"): {
//                    System.out.println("x / y = " + (x/y));
                        if (y==0){
                            System.out.println(" На 0 делить нельзя!");
                        } else {
                        System.out.println(x +" / "+ y +" = "+ (x/y));
                        }
                        break;
                    }
                }
            }
            else {
                System.out.println("Введеный оператор не верный. Всего хорошего)");
            }
        }
    }
}
