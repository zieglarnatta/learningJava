package com.JavaLearning;

public class numericExpressions {
    public static void main(String[] args) {
        int firstVar = 12;
        int secondVar = 3;

        int adding = firstVar + secondVar;
        System.out.println("Adding firstVar with secondVar equals: " + adding);

        int subtraction = firstVar - secondVar;
        System.out.println("Subtracting firstVar with secondVar equals: " + subtraction);

        int multiplication = firstVar * secondVar;
        System.out.println("Multiplying firstVar with secondVar equals: " + multiplication);

        double division = firstVar / secondVar;
        System.out.println("Dividing firstVar with secondVar equals: " + division);

        double exponent = Math.pow(firstVar , secondVar); // shoudl yield 1728
        System.out.println("exponent firstVar to the power of secondVar equals: " + exponent);

        double remainder = firstVar % secondVar;
        System.out.println("remainder of firstVar from secondVar equals: " + remainder);
    }
}
