package Cheapter2;

import java.util.Scanner;
/*(Compute the volume of a cylinder) Write a program that reads in the radius and length
 of a cylinder and computes the area and volume using the following formulas:
   area = radius * radius * p volume = area * length  */

public class Solution02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius ");
        double radius = input.nextDouble();
        System.out.println("Please enter length ");
        double length = input.nextDouble();

        double area = radius * radius * 3.14159 ;
        double volume = area * length ;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);


    }
}
