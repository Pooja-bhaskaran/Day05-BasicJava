package com.Bridgelabz.BasicCore;

public class Factors {
    public static void main(String[] args) {
        System.out.println(" Prime Factor Program ");
        int num = 12;
        System.out.println("The factor number of " + num + " are ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
//        System.out.println(num);
    }
}
