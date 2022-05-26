package com.Bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class TwoDimensionalArray {
    static int M, N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a value for M rows  : ");
        M = sc.nextInt();
        System.out.print(" Enter a value for N columns : ");
        N = sc.nextInt();
        Array();
    }

    static int Array() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Row : " + M + " , Column : " + N );
                arr[i][j] = sc.nextInt();
                System.out.println(arr[i][j]);
//                return arr[i][j];
            }
            System.out.println();
        }
        return 0;
    }
}
