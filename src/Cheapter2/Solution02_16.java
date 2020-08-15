package Cheapter2;

import java.util.Scanner;

/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays its area.
*/
public class Solution02_16 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the side: ");
            double s = input.nextDouble();

            double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2);

            System.out.println("The area of the hexagon is " + area);

    }
}
