package com.JavaLearning;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you!");
        /*} else if (inputtedNum != int){
            System.out.println("Input value is not an integer aka round whole number!");*/
        } else
            System.out.println("Your shoe selection will make you happy today!");
        input.close();
    }
}
