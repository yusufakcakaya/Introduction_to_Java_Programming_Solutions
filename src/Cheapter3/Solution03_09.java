package Cheapter3;
/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
        The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
        (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11
        If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
        Write a program that prompts the user to enter the first 9 digits and displays the 10-digit
        ISBN (including leading zeros). Your program should read the input as an integer.*/

import java.util.Scanner;

public class Solution03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer:");

        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        int number = isbn % 100000000;
        int d2 = number / 10000000;
        number %= 10000000;
        int d3 = number / 1000000;
        number %= 1000000;
        int d4 = number / 100000;
        number %= 100000;
        int d5 = number / 10000;
        number %= 10000;
        int d6 = number / 1000;
        number %= 1000;
        int d7 = number / 100;
        number %= 100;
        int d8 = number / 10;
        number %= 10;
        int d9 = number;


        int checkSum =(d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11;
        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (checkSum == 10)
            System.out.println("X");
        else
            System.out.println(checkSum);

    }
}
