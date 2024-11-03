package com.JavaLearning;

public class ifStatements01 {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean isRich = false;
        boolean isFree = true;

        if (isHappy && isRich) {
            System.out.println("Yay! You're rich and Happy");
        } else {
            System.out.println("You're potentially not Happy and / or not rich");
        }
        if (isHappy && !isRich) {
            System.out.println("Meh! You're happy but not Rich :(");
        }
        if (isHappy && isFree) {
            System.out.println("Oh yeah! You're Happy and Free!");
        }
    }
}
