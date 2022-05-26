package com.Bridgelabz.FunctionalProgram;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Three Numbers for a b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

       double delta = (b * b) - (4 * a * c);
        System.out.println("delta is  : " + delta );

        double root1_Of_X = ((-b) + sqrt(delta))/(2*a);
        double root1_Of_Y = ((-b) - sqrt(delta))/(2*a);
        System.out.println("Root 1 of x + " + root1_Of_X );
        System.out.println("Root 1 of Y + " + root1_Of_Y );
    }
}
