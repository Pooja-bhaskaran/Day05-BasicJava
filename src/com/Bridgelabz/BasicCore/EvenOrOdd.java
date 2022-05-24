package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is Even number ");
        else
            System.out.println(num + " is Odd number ");
    }
}
