package com.Bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Distance {
    static double x , y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x co-ordinates : ");
        x = scanner.nextDouble();
        System.out.print("Enter the y co-ordinates : ");
        y = scanner.nextDouble();
        distance(x,y);
        System.out.println("Distance = " + distance(x,y));
    }

    private static double distance(double x, double y) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
}
