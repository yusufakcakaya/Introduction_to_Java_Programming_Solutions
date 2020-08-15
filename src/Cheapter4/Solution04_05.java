package Cheapter4;

import java.util.Scanner;

/*(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 in which all sides are of the same length and all
angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 Here, s is the length of a side. Write a program that prompts the user to enter the
 number of sides and their length of a regular polygon and displays its area*/
public class Solution04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        double n = input.nextDouble();


        System.out.println("Enter the side:");
        double side = input.nextDouble();

        double area =( n * (Math.pow(side,2))) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the polygon is " + area);
        input.close();

        input.close();
    }
}
