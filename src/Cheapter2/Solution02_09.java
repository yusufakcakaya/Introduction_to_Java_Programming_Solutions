package Cheapter2;

import java.util.Scanner;

/*
Physics: acceleration) Average acceleration is defined as the change of velocity
        divided by the time taken to make the change, as shown in the following formula:
        (v1 - v0) /t
        Write a program that prompts the user to enter the starting velocity v0 in meters/ second,
        the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.*/
public class Solution02_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);
    }
}
