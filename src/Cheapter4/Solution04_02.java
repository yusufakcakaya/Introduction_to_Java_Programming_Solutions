package Cheapter4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*(Geometry: great circle distance) The great circle distance is the distance
between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
geographi- cal latitude and longitude of two points. The great circle distance
between the two points can be computed using the following formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of
two points on the earth in degrees and displays its great circle distance.
 The average earth radius is 6,371.01 km. Note that you need to convert the degrees
 into radians using the Math.toRadians method since the Java trigonometric methods
 use radians. The latitude and longitude degrees in the formula are for north and west.
  Use negative to indicate south and east degrees*/
public class Solution04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter point 1 (latitude and longitude) in degrees:");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees:");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        double rX =  Math.toRadians(x1);


        System.out.println("Pending...");

    }
}
