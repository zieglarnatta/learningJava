package com.JavaLearning;

public class TriangleMainCalculate {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15,
                8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,
                3, 3);
        double triangleAArea = triangleA.findArea();
        System.out.println("The area of triangleA is: " + triangleAArea);
        System.out.println("Triangle A Side Length Three: " + triangleA.sideLenThree);

        double triangleBArea = triangleB.findArea();
        System.out.println("The area of triangleB is: " + triangleBArea);
        System.out.println("Triangle B Base Length Three: " + triangleB.base);

        System.out.println("Number of sides: " + Triangle.numOfSides);

    }
}
