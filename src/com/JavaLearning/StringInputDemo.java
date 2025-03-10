package com.JavaLearning;

import java.util.Scanner;

public class StringInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input favorite color: ");
        String inputColor = scanner.nextLine();

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Input favorite hobby: ");
        String inputHobby = scanner.nextLine();

        System.out.println("My favotie color is : " + " " + inputColor);
        System.out.println("and my favotie hobby is : " + " " + inputHobby);

        scanner.close();
    }
}
