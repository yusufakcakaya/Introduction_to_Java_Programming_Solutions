package Cheapter2;

import java.util.Scanner;

/*(Convert pounds into kilograms) Write a program that converts pounds into kilo- grams. The program prompts the user to
        enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms.*/
public class Solution02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUND_KG = 0.454;

        System.out.println("Enter a value for Pound ");
        double pound = input.nextDouble();
        double kg =  pound * POUND_KG;

        System.out.println(pound + " pound is " + kg+ " kg");
    }
}
