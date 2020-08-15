package Cheapter3;
/*
(Sort three integers) Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
*/

import java.util.Scanner;

public class Solution03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers for sorting : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        if (number2 < number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
            }
        if(number3 < number2){
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number2 < number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
