package Cheapter4;

import java.util.Scanner;

public class Solution04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String string2 = input.nextLine();

        boolean isContains = (string1.contains(string2));

        if(isContains){
            System.out.println(string2 + " is a substring of " + string1);
        }else
            System.out.println(string2 + " is not a substring of " + string1);

        input.close();
    }
}
