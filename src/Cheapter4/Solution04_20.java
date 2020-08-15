package Cheapter4;
/*(Process a string) Write a program that prompts
the user to enter a string and dis- plays its length and its first character.*/

import java.util.Scanner;

public class Solution04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String st = input.nextLine();

        char first = st.charAt(0);

        System.out.println("Entered string is " + st + "  and the lenght is " + st.length());

        input.close();
    }
}
