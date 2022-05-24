package com.Bridgelabz.BasicCore;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        harmonic();
    }

    public static void harmonic() {
        int i;
        int n;
        System.out.println(" Nth Harmonic Number ");
        float sum = 0;
        System.out.println(" Enter the number n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = (float) (sum + 1.0 / i);
        }
        System.out.println(" The Nth harmonic number N is : " + sum);
    }
}
