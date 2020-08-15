package Cheapter4;

import java.util.Scanner;

/*(Vowel or consonant?) Write a program that prompts the user
to enter a letter and check whether the letter is a vowel or consonant.*/
public class Solution04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();
        String letterUpper = letter.toUpperCase();
        String letterLower = letter.toLowerCase();

        char l = letter.charAt(0);
        char lUpper = letterUpper.charAt(0);
        char lLowerr = letterLower.charAt(0);

        if (l == lUpper) {
            System.out.println(letterUpper + " is a consonant");
        }else if (l == lLowerr){
            System.out.println(letterLower + " is a vowel ");
        }else
            System.out.println(letter + " is an invalid input");

        input.close();
    }
}
