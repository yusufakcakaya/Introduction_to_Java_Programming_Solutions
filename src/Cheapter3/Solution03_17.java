package Cheapter3;

import java.util.Scanner;

/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game.
        (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
        The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to
        enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.*/
public class Solution03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int generatedNumber = (int)(Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();

       if(generatedNumber == 0) System.out.print("The computer is scissor. ");
       else if (generatedNumber == 1) System.out.print("The computer is rock. ");
       else System.out.print("The computer is paper. ");

        if(player == 0) System.out.print(" You are scissor");
        else if (player == 1) System.out.print("You are rock");
        else System.out.print(" You are paper");

        if (generatedNumber == player)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win = (player == 0 && generatedNumber == 2) ||
                    (player == 1 && generatedNumber == 0) ||
                    (player == 2 && generatedNumber == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }
}
