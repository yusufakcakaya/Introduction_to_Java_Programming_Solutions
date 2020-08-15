package Cheapter3;
import java.util.Scanner;

/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three- digit number.
        The program prompts the user to enter a three-digit number and determines whether the user
        wins according to the following rules:
        1. If the user input matches the lottery number in the exact order, the award is $10,000.
        2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
        3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*/
public class Solution03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotteryNumber = (int) (Math.random() * 1000);

        System.out.print("Enter a three-digit number: ");
        int guess = input.nextInt();

        int hund = lotteryNumber / 100;
        int num = lotteryNumber % 100;
        int tens = num / 10;
        int ones= num % 10;

        int a = guess / 100;
        int num1= guess % 100;
        int b = num1 / 10;
        int c = num1 % 10;

        System.out.println("The lottery number is " + lotteryNumber);

        if(lotteryNumber == guess) {
            System.out.println("The award is $10,000.");
        }else if ((hund == a ||hund == b ||hund == c) &&
                 (tens == a ||tens == b ||tens == c) &&
                 (ones == a ||ones == b ||ones == c)){
            System.out.println("The award is $3,000.");
        }else if ((hund == a ||hund == b ||hund == c) ||
                (tens == a ||tens == b ||tens == c) ||
                (ones == a ||ones == b ||ones == c)){
            System.out.println("The award is 1,000");
        }else System.out.println("Try again!");

    }
}