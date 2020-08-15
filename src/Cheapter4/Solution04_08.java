package Cheapter4;

import java.util.Scanner;

public class Solution04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code:");
        int aCode = input.nextInt();

        if (aCode < 127 && aCode >0){
            System.out.println("The character for ASCII code " + aCode + " is " +
                    (char)aCode);

        }else{
            System.out.println("Please enter a number between 0 - 127");

            int bCode = input.nextInt();
            if (bCode < 127 && bCode >0){
                System.out.println("The character for ASCII code " + bCode + " is " +
                        (char)bCode);


            }
        }
        input.close();
    }
}
