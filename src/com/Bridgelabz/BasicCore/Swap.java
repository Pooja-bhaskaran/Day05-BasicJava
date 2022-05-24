package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x;
        int y;
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X and Y : ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Before swapping :" + "x = " + x + " ; " + "y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping:" + "x = " + x + "; " + "y = " + y);
    }
}
