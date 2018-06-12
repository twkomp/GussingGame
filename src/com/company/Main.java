package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomNumber;
        randomNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomNumber);
    }
}