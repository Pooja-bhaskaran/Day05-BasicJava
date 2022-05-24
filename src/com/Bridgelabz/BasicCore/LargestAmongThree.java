package com.Bridgelabz.BasicCore;

public class LargestAmongThree {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 220;
        int n3 = 70;

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number ");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number ");

        else
            System.out.println(n3 + " is the largest number ");
    }
}
