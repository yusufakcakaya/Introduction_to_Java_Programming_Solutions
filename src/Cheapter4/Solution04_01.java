package Cheapter4;

import java.util.Scanner;
/*(Geometry: area of a pentagon) Write a program that prompts the user to enter the
length from the center of a pentagon to a vertex and computes the area of the pentagon*/
public class Solution04_01 {
    public static void main (String[]args){
        //Geometry: area of a pentagon
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        double r = input.nextDouble();

        double s = 2*r * (Math.sin(Math.PI/5));
        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI/5));

        System.out.println("The area of the pentagon is " + area);

        input.close();

    }
}
