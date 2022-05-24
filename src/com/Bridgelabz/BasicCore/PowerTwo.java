package com.Bridgelabz.BasicCore;

public class PowerTwo {
    public static void main(String[] args) {
        power();
    }

    public static void power() {
        int n = 31;
        int base = 2;
        for (int i = 0; i <= n; i++) {
            System.out.println("Power of : " + base + "^" + i + " is : " + Math.pow(base, i));
        }
    }
}
