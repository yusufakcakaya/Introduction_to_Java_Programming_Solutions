package Cheapter3;/*
Science: day of the week) Zeller’s congruence is an algorithm developed by
        Christian Zeller to calculate the day of the week. The formula is h = ¢q + 26(m + 1) + k + k + j + 5j≤%7
        where
        ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
        ■ q is the day of the month.
        ■ m is the month (3: March, 4: April, ..., 12: December). January and February
        are counted as months 13 and 14 of the previous year.
        ■ j is the century (i.e., year). 100
        ■ k is the year of the century (i.e., year % 100).
        Note that the division in the formula performs an integer division.
        Write a pro- gram that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.*/

import java.util.Scanner;

public class Solution03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31:");
        int day = input.nextInt();

        if(month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int q, m, k, j;
        q = day;
        m = month;
        k = year % 100;
        j = (year-k)/100;

        int congruence = (q + (13 * (m +1) / 5) + k + (k / 4) + (j /  4) + (5 * j)) % 7;

        System.out.println("Day of week is ");
        switch(congruence)
        {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
    }
}
