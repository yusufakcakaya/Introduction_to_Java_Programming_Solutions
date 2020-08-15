package Cheapter3;/*
(Cost of shipping) A shipping company uses the following function to calcu- late the cost
        (in dollars) of shipping based on the weight of the package (in pounds).
        ........

        Write a program that prompts the user to enter the weight of the package and display the shipping cost.
        If the weight is greater than 50, display a message “the package cannot be shipped.”*/

import java.util.Scanner;

public class Solution03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();
        double costOfShipping = 0;

        if (weight > 50)
            System.out.println("The package cannot be shipped.");
        else if (weight > 0 && weight <= 1)
                costOfShipping = 3.5;
        else if (weight <= 3)
                costOfShipping = 5.5;
        else if (weight <= 10)
                costOfShipping = 8.5;
        else
            costOfShipping = 10.5;


            System.out.println("Shipping cost of package is $" +costOfShipping * weight);

    }
}
