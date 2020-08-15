package Cheapter2;

import java.util.Scanner;
/*(Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
        displays the population after the number of years.
        Use the hint in Programming Exercise 1.11 for this program. The population should be cast into an integer*/
public class Solution02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * years);

        System.out.println("The population in " + years + " is " + population);
    }
}
