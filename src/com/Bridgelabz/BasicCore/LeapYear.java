package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println(" Leap Year Program ");
        int year;
        System.out.println(" Enter the year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ( year % 4 == 0){
            System.out.println(" The Specified Year is Leap Year ");
        }
        else
            System.out.println(" The Specified year is not a Leap Year ");
    }
}
