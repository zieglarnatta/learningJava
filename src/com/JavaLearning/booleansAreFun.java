package com.JavaLearning;

public class booleansAreFun {
    public static void main(String[] args) {
        boolean inStock = false;
        boolean hasPaid = true;

        boolean requiresRefund = (inStock==false) && (hasPaid==true);
        System.out.println("Because the inStock value is: " + inStock + " and the customer hasPaid value: " + hasPaid + " so we have to refund: " + requiresRefund);

        boolean x = true, y = true, z = false; // one shot declare 3 variables as booleans

        boolean results = x && y;
        System.out.println("Boolean X true AND y true equals: " + results);

        boolean results2 = x && !y;
        System.out.println("Boolean X true AND y NOT true equals: " + results2);

        boolean results3 = x || z;
        System.out.println("Boolean X true OR z false equals: " + results3);
    }
}
