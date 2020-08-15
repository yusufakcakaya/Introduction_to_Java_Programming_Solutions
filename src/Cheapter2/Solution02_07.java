package Cheapter2;

/*(Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
        and displays the number of years and days for the min- utes. For simplicity, assume a year has 365 days.*/

import java.util.Scanner;

public class Solution02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes ");
        int number = input.nextInt();

        int years = number / 525600;
        int days = number % 525600 / 1440;

        System.out.println(number + " minutes is approximately " + years + " years and " + days + " days");


    }
}
