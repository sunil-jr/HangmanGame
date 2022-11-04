package com.hangmangame;

import java.util.Arrays;
import java.util.Scanner;

public class hangmanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hang Man Game!");
        String letter = "";
        String[] words = {"a", "e", "i", "o", "u"};
        String[] dashes = {"-", "-", "-", "-", "-"};
        System.out.println(Arrays.toString(dashes));
        int count = 0;

        while (!Arrays.equals(words, dashes) && count < 3) {
            System.out.println("Enter the letter: ");
            letter = scanner.nextLine();
            boolean correct = false;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(letter)) {
                    correct = true;
                    dashes[i] = words[i];
                }
            }
            System.out.println(Arrays.toString(dashes));
            if (!correct) count++;
        }
        if (Arrays.equals(words, dashes)) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Hanged! The letters are: " + Arrays.toString(words));
        }
        scanner.close();
    }
}
