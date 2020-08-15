package Cheapter4;

import java.util.Scanner;

/*(Check SSN) Write a program that prompts the user to enter
 a Social Security number in the format DDD-DD-DDDD, where D is a digit.
  Your program should check whether the input is valid*/
public class Solution04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String number = input.nextLine();

        //DDD-DD-DDDD
        boolean isValid = (Character.isDigit(number.charAt(0)) &&
                Character.isDigit(number.charAt(1)) &&
                Character.isDigit(number.charAt(2)) &&
                number.charAt(3) == '-' &&
                Character.isDigit(number.charAt(4)) &&
                Character.isDigit(number.charAt(5)) &&
                number.charAt(6) == '-' &&
                Character.isDigit(number.charAt(7)) &&
                Character.isDigit(number.charAt(8)) &&
                Character.isDigit(number.charAt(9)) &&
                Character.isDigit(number.charAt(10)) );

        System.out.println(number + " is " + ((isValid) ? "a valid " : "an invalid ")
                + "social security number");


        input.close();

    }
}
