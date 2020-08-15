package Cheapter3;
/*(Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines
whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.*/

import java.util.Scanner;

public class Solution03_26 {
    public static void main (String [] args){
        System.out.println("Please enter an integer : ");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();

        int devisible5 = number % 5;
        int devisible6 = number % 6;

        boolean and = (devisible5 == 0) && (devisible6 == 0);
        boolean or = (devisible5 == 0) || (devisible6 == 0);
        boolean orNot = (devisible5 == 0) ^ (devisible6 == 0);

            System.out.println("Is " + number + " divisible by 5 and 6? " + and);
            System.out.println("Is " + number + " divisible by 5 or 6? " + or);
            System.out.println("Is " + number + " divisible by 5 or 6?, but not both?"+ orNot);

        input.close();
    }
}
