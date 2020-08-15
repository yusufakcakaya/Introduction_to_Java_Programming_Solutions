package Cheapter3;
/*
(Random point) Write a program that displays a random coordinate in a rectangle.
        The rectangle is centered at (0, 0) with width 100 and height 200.*/

public class Solution03_16 {
    public static void main(String[] args) {

        int width = (int)(Math.random() * (100));
        int height = (int)(Math.random() * (200) );

        System.out.println("Center at (0,0) width is " + width + " height is " + height );

    }

}
