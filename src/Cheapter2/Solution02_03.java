package Cheapter2;

import java.util.Scanner;

/*(Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the result.
        One foot is 0.305 meter.*/
public class Solution02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double FEET = 0.305;

        System.out.println("Enter a value for feet ");
        double feet = input.nextDouble();
        double meter = feet * FEET;

        System.out.println(feet + " is feet is " + meter);
    }
}
