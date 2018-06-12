package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int lives = 8;
        System.out.println("welcome to the guessing game! im thinking of a number 1-100 can you guess it? ");
        Scanner input = new Scanner(System.in);
        int randomNumber;
        randomNumber = (int) Math.ceil(Math.random() * 100);
        //System.out.println(randomNumber);
        int i=0;
        int guess;
        while (i<lives) {
            try {
                System.out.print("your guess: ");
                //java.util.concurrent.TimeUnit.MILLISECONDS.sleep(50);
                guess = input.nextInt();
                System.out.println();
                if (guess == randomNumber) {
                    System.out.println("You guessed the number!");
                    break;
                } else {
                    System.out.print("Incorrect! ");
                    if (guess < randomNumber) {
                        System.out.println("Your guess is too low, Guess Higher");
                    } else {
                        System.out.println("Your guess is too high, Guess Lower");
                    }
                    i = i + 1;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Incorrect type of input!");
                input.nextLine();
                i = i + 1;
            }
        }
        if (i >= lives) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }
        System.out.println(randomNumber + " was the answer!");
    }
}