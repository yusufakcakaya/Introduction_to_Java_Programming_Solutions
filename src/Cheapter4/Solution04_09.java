package Cheapter4;

import java.util.Scanner;

/*(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode.*/
public class Solution04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        String chr = input.nextLine();

        char chr1 = chr.charAt(0);
        
        int uCode = (int)chr1;
        
        System.out.println("The Unicode for the character " + chr + " is " +
        uCode);

        input.close();

    }
}
