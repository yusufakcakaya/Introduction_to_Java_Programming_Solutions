package Cheapter3;/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a point (x, y) and
        checks whether the point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle
        and (9, 9) is outside the circle, as shown in Figure 3.7a.
        Enter year: (e.g., 2012): 2012
        Enter month: 1-12: 5
        Enter the day of the month: 1-31: 12 Day of the week is Saturday
        (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. 22
        The formula for computing the distance is 2(x2 - x1) + (y2 - y1) . Test your program to cover all cases.)*/

import java.util.Scanner;

public class Solution03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean inCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        if(inCircle) System.out.println("Point (" + x + ", "+ y + ") is in the cicrcle");
        else System.out.println("Point (" + x + ", "+ y + ") is not in the cicrcle");

    }
}
