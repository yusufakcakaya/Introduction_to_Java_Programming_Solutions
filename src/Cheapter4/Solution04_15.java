package Cheapter4;

import java.util.Scanner;
/*
Write a program that prompts the user to enter a letter and displays its correspond- ing number.
*/
public class Solution04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter :");

        String letter = input.nextLine();
        char letterChar = letter.charAt(0);

        switch (letterChar){
            case 'A':
            case 'B':
            case 'C':
            case 'a':
            case 'b':
            case 'c':
                System.out.println("The corresponding number is 2 " );
                break;
            case 'D':
            case 'E':
            case 'F':
            case 'd':
            case 'e':
            case 'f':
                System.out.println("The corresponding number is 3 " );
                break;
            case 'G':
            case 'H':
            case 'I':
            case 'g':
            case 'h':
            case 'i':
                System.out.println("The corresponding number is 4 " );
                break;
            case 'J':
            case 'K':
            case 'L':
            case 'j':
            case 'k':
            case 'l':
                System.out.println("The corresponding number is 5 " );
                break;
            case 'M':
            case 'N':
            case 'O':
            case 'm':
            case 'n':
            case 'o':
                System.out.println("The corresponding number is 6 " );
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println("The corresponding number is 7 " );
                break;
            case 'T':
            case 'U':
            case 'V':
            case 't':
            case 'u':
            case 'v':
                System.out.println("The corresponding number is 8 " );
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("The corresponding number is 9 " );
                break;
            case '0':
                System.out.println("The corresponding number is 0 " );
                break;
            case '1':
                System.out.println("The corresponding number is 1 " );
                break;

            default:
                System.out.println(letterChar + " is an invalid input");
        }
        input.close();
    }
}
