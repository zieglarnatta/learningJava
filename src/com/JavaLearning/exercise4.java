package com.JavaLearning;

public class exercise4 {
    public static void main(String[] args) {
        int principle = 100;
        int years = 5;
        double percent = 10;

        System.out.println("The Principle amount is: " + principle);
        System.out.println("The number of years is: " + years);
        System.out.println("The percent interest amount is: " + percent + "%");
        //double calcPercent = percent/100;
        //double calculatedPercent = 1 + calcPercent;
        double calculatedPercent = 1 + percent / 100;

        double finalInflationAmount1 = principle * calculatedPercent;
        System.out.println("Final amount from principle " + principle + " multiplied by the percent " + percent + "is: " + finalInflationAmount1);

        double finalInflationAmount2 = finalInflationAmount1 * calculatedPercent;
        System.out.println("Final amount from principle " + finalInflationAmount1 + " multiplied by the percent " + percent + " is: " + finalInflationAmount2);

        double finalInflationAmount3 = finalInflationAmount2 * calculatedPercent;
        System.out.println("Final amount from principle " + finalInflationAmount2 + " multiplied by the percent " + percent + " is: " + finalInflationAmount3);

        double finalInflationAmount4 = finalInflationAmount3 * calculatedPercent;
        System.out.println("Final amount from principle " + finalInflationAmount3 + " multiplied by the percent " + percent + " is: " + finalInflationAmount4);

        double finalInflationAmount5 = finalInflationAmount4 * calculatedPercent;
        System.out.println("Final amount from principle " + finalInflationAmount4 + " multiplied by the percent " + percent + " is: " + finalInflationAmount5);

        String totalAmountDue = Double.toString(finalInflationAmount5); // transform the numerical value to string
        int indexOfDecimanPoint = totalAmountDue.indexOf("."); // count up the length of the string, to queue up for next step of upper bound substring class
        String totalAmtFormatted = totalAmountDue.substring(0,indexOfDecimanPoint+3); // grab the string value of the number and add u to 2 decimal places, up to but not including the 3rd
        System.out.println("Total amount due on year 5 is: " + totalAmtFormatted); // final formatted printout
    }
}
