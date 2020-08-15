package Cheapter3;/*
(Compute the perimeter of a triangle) Write a program that reads three edges
        for a triangle and computes the perimeter if the input is valid. Otherwise,
        display that the input is invalid. The input is valid if the sum of
        every pair of two edges is greater than the remaining edge.*/

import java.util.Scanner;

public class Solution03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers for triangle : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(a + b > c && a + c > b && b + c > a)
            System.out.println("The input invalid and perimeter is " + (a + b + c));
        else
            System.out.println("The input is invalid!");
    }
}
