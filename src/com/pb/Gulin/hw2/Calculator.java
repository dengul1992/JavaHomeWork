package com.pb.Gulin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x,y;
        String symbol;
        Scanner scan= new Scanner (System.in);
        System.out.println("Введите значение x:");
        x= scan.nextInt();

        System.out.println("Введите значение y:");
        y= scan.nextInt();

        System.out.println("Введите математический оператор : +, -, *, /");
        symbol= scan.next();
        if (symbol.equals("+")  || symbol.equals("-")  || symbol.equals("*")  || symbol.equals("/") ) {
            switch (symbol) {
                case ("+"): {
                    System.out.println("x + y = "+ (x+y));
                    break;
                }
                case ("-"): {
                    System.out.println("x - y = "+ (x-y));
                    break;
                }
                case ("*"): {
                    System.out.println("x * y = "+ (x*y));
                    break;
                }
                case ("/"): {
                    System.out.println("x / y = " + (x/y));
                    break;
                }
            }
        } else {
            System.out.println("Введите оператор из предложенных : +, -, *, /");
            symbol= scan.next();
            if (symbol.equals("+")  || symbol.equals("-")  || symbol.equals("*")  || symbol.equals("/")) {
                switch (symbol) {
                    case ("+"): {
                        System.out.println("x + y = "+ (x+y));
                        break;
                    }
                    case ("-"): {
                        System.out.println("x - y = "+ (x-y));
                        break;
                    }
                    case ("*"): {
                        System.out.println("x * y = "+ (x*y));
                        break;
                    }
                    case ("/"): {
                        System.out.println("x / y = " + (x/y));
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
