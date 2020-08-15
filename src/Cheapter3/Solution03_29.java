package Cheapter3;

import java.util.Scanner;

/*(Geometry: two circles) Write a program that prompts the user to enter
the center coordinates and radii of two circles and determines whether
the second circle is inside the first or overlaps with the first,
as shown in Figure 3.10. (Hint: circle2 is inside circle1 if the distance
 between the two centers  = |r1 - r2| and circle2 overlaps circle1 if
 the distance between the two centers <= r1 + r2. Test your program to
  cover all cases.*/
public class Solution03_29 {
    public static void main(String[] args) {
        //     boolean inCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);
       Scanner input = new Scanner(System.in);
       System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double  radius1 = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double  radius2 = input.nextDouble();

        double x = x2 - x1;
        double y = y2 - y1;

         boolean inCircle = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= Math.abs(radius1 - radius2);
         boolean overLapseCircle = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= radius1 + radius2;

         if(inCircle){
             System.out.println("circle2 is inside circle1 ");
         }else if(overLapseCircle){
             System.out.println("circle2 overlaps circle1");
         }else {
             System.out.println("circle2 does not overlap circle1 ");
         }

    }
}
