package com.company1;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 17.05.2018.
 */
public class Main {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik, to: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Jaka operacja ma byc wykonana? Napisz \" M\" jeśli ma to byc mnożenie i wciśnij <Enter>." +
                "Każdy inny wybór oznacza dodawanie");
        return scanner.next().equals("M");

    }

    private double getArgument() {
        System.out.println("Podaj liczbę: ");
        return scanner.nextDouble();


    }
}
