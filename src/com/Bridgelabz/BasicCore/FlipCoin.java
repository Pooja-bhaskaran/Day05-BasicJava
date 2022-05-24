package com.Bridgelabz.BasicCore;

public class FlipCoin {

    public static void main(String[] args) {
        System.out.println("Flip a coin Program");
        int numOfTimeFlip = 10;
        for (int i =1 ; i <= numOfTimeFlip; i++){
            if (Math.random() < 0.5 ){
                System.out.println(i + ": Heads");
            }
            else
                System.out.println(i + ": Tails");
        }
    }
}
