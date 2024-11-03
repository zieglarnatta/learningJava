package com.JavaLearning;

public class exercise3 {
    public static void main(String[] args) {
        int principle = 100;
        int years = 5;
        double percent = 10;
        //double calcPercent = percent/100;
        //double calculatedPercent = 1 + calcPercent;
        double calculatedPercent = 1 + percent / 100;
        double finalInflationAmount1 = principle * calculatedPercent;
        System.out.println("Final amount from principle " + principle + " multiplied by the percent " + percent + "is: " + finalInflationAmount1);

        double finalInflationAmount2 = finalInflationAmount1 * calculatedPercent;
        System.out.println("Final amount from principle " + principle + "multiplied by the percent " + percent + "is: " + finalInflationAmount2);

        double finalInflationAmount3 = finalInflationAmount2 * calculatedPercent;
        System.out.println("Final amount from principle " + principle + "multiplied by the percent " + percent + "is: " + finalInflationAmount3);

        double finalInflationAmount4 = finalInflationAmount3 * calculatedPercent;
        System.out.println("Final amount from principle " + principle + "multiplied by the percent " + percent + "is: " + finalInflationAmount4);

        double finalInflationAmount5 = finalInflationAmount4 * calculatedPercent;
        System.out.println("Final amount from principle " + principle + "multiplied by the percent " + percent + "is: " + finalInflationAmount5);
    }
}
