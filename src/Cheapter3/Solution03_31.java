package Cheapter3;

import java.util.Scanner;

/*(Financials: currency exchange) Write a program that prompts the user to enter
 the exchange rate from currency in U.S. dollars to Chinese RMB.
  Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and
  1 to convert from Chinese RMB and U.S. dollars. Prompt the user to enter
  the amount in U.S. dol- lars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.*/
public class Solution03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int option = input.nextInt();

        double amount;
        switch(option)
        {
            case 0: System.out.print("Enter the dollar amount: ");
                amount = input.nextDouble();
                System.out.println("$" + amount + " is " +
                        (amount * rate) + " yuan"); break;
            case 1: System.out.print("Enter the RMB amount: ");
                amount = input.nextDouble();
                System.out.println(amount + " yuan is $" +
                        ((int)((amount * 100) / rate)) / 100.0); break;
            default: System.out.println("Incorrect input");
        }
    }
}
