package Cheapter3;
/*(Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines whether
    it is a palindrome number.
    A number is palin- drome if it reads the same from right to left and from left to right.*/

import java.util.Scanner;

public class Solution03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int hunderds = (number / 100);
        int num = number % 100;
        int ones = (num % 10);

        if(hunderds == ones ) System.out.println(number + " is a palindrome ");
        else System.out.println(number + " is not a palindrome ");
    }


}
