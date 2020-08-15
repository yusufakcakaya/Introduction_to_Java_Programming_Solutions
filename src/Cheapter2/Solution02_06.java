package Cheapter2;
/*(Sum the digits in an integer) Write a program that reads
        an integer between 0 and 1000 and adds all the digits in the integer.
        For example, if an integer is 932, the sum of all its digits is 14.
        Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
        For instance, 932 % 10 = 2 and 932 / 10 = 93.*/

import java.util.Scanner;

public class Solution02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        System.out.println("Enter a number between 0 and 1000");
        int number = input.nextInt();

        hundreds = number / 100;
        tens = (number  / 10) %10 ;
        ones = (number) - (hundreds * 100 + tens * 10);

        int sum = hundreds + tens + ones;

        System.out.println("The sum of the digits is " + sum);






    }


}
