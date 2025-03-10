package com.JavaLearning;

import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first grade: ");
        double gradeExam1 = scanner.nextDouble();

        System.out.println("Enter second grade: ");
        double gradeExam2 = scanner.nextDouble();

        System.out.println("Enter third grade: ");
        double gradeExam3 = scanner.nextDouble();

        double averageGrade = (gradeExam1 + gradeExam2 + gradeExam3) / 3;
        String formattedAverage = String.format("%.2f", averageGrade);

        System.out.println("First Grade is: " + gradeExam1);
        System.out.println("Second Grade is: " + gradeExam2);
        System.out.println("Third Grade is: " + gradeExam3);
        System.out.println("Your average grade is: " + averageGrade);
        System.out.println("Your formatted average grade is: " + formattedAverage);
        scanner.close();
    }
}
