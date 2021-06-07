/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise20 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double amount = scan.nextDouble();
        System.out.println("What state do you live in?");
        String state = scan.next();

        double tax;
        double countyTax;
        double temp;
        double temp2;
        double total;

        if(state.equalsIgnoreCase("Wisconsin")) {
            tax = 0.05;
            System.out.println("What county do you live in?");
            String county = scan.next();
            if(county.equalsIgnoreCase("Eau Claire")){
                countyTax = 0.005;
                temp = amount*tax;
                temp2 = amount*countyTax;
                total = amount+temp+temp2;
                System.out.println("The tax is $"+(temp+temp2)+".");
                System.out.println("The total is $"+total+".");
            }
            else if(county.equalsIgnoreCase("Dunn")) {
                countyTax = 0.004;
                temp = amount*tax;
                temp2 = amount*countyTax;
                total = amount+temp+temp2;
                System.out.println("The tax is $"+(temp+temp2)+".");
                System.out.println("The total is $"+total+".");
            }
            else {
                temp = amount * tax;
                total = amount + temp;
                System.out.println("The tax is $" + temp + ".");
                System.out.println("The total is $" + total + ".");
            }
        }
        else if(state.equalsIgnoreCase("Illinois")) {
            tax = 0.08;
            temp = amount*tax;
            total = amount+temp;
            System.out.println("The tax is $"+temp+".");
            System.out.println("The total is $"+total+".");
        }
        else
            System.out.println("The total is $"+amount+".");
    }
}