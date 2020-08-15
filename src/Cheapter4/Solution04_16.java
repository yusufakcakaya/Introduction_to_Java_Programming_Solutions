package Cheapter4;
/*(Random character) Write a program that displays a random uppercase letter using the Math.random() method.*/
public class Solution04_16 {
    public static void main(String[] args) {
            int random = 64 + (int) (Math.random() * (91-64));
            char letter = (char)random;
            System.out.println(letter);

    }
}
