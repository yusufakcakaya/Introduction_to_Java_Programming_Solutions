package Cheapter4;

import java.util.Scanner;

/*(Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side):
Write a program that prompts the user to enter the side of a hexagon and displays its area. */
public class Solution04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side:");
        double side = input.nextDouble();

        double area =( 6 * (Math.pow(side,2))) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + area);

    input.close();
    }
}
