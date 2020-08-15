package Cheapter3;
/*
(Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails.
        The program randomly generates an integer 0 or 1, which represents head or tail.
        The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.*/

import java.util.Scanner;

public class Solution03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int flipCoin = (int) (Math.random() * 2);

        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();

        if(flipCoin == guess) System.out.println("Correct");
        else System.out.println("Incorrect");

    }
}