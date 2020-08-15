package Cheapter4;

import java.util.Scanner;

/*(Convert letter grade to number) Write a program
that prompts the user to enter a letter grade A, B, C, D, or F and
 displays its corresponding numeric value 4, 3, 2, 1, or 0. */
public class Solution04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade:");

        String letter = input.nextLine();
        char letterChar = letter.charAt(0);

        switch (letterChar){
            case 'A':
                System.out.println("The numeric value for grade " + letterChar+" is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade " + letterChar+" is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade " + letterChar+" is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade " + letterChar+" is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade " + letterChar+" is 0");
                break;
            default:
                System.out.println(letterChar + " is an invalid grade");
        }
        input.close();
    }
}
