package com.JavaLearning;
import java.util.Scanner;

public class SalaryCalculator {

// Java code below
// Write your answer here, and then test your code.
// Your job is to implement the calculateYearlySalary() method.

        // Change these boolean values to control whether you see
        // the expected result and/or hints.
        static boolean showExpectedResult = false;
        static boolean showHints = false;

        public static double calculateYearlySalary() {
            // Your code goes here.
            System.out.println("Input your hours per week: ");
            Scanner input = new Scanner(System.in);
            double hoursPerWeek = input.nextDouble();


            System.out.println("Input your hourly pay rate: ");
            double amountPerHour = input.nextDouble();

            if (hoursPerWeek < 0 || amountPerHour < 0) {
                return 0;
            }

            double yearlySalary;
            yearlySalary = hoursPerWeek * amountPerHour * 52;
            return yearlySalary;
        }

        public static void main(String[] args) {
            double v = calculateYearlySalary();
            System.out.println("Your gross yearly salary is: " + v);
        }

    }
