/*
    lab1_CarrieWard.java
    Carrie Ward
    08/25/2017
    Version 1.0
    A simple JAVA program that calculates and displays monthly mortgage payments.
*/

import java.util.Scanner;

public class Mortgage {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        double amount = 0.0;
        double year = 0.0;
        double term = 0.0;
        double rate = 0.0;
        double interest = 0.0;
        double monthlyPayment = 0.0;
        
        // request the mortgage principle from the user
        System.out.print("Enter the mortgage principle: ");
        // store the user data
        amount = in.nextDouble();
        
        // request the mortgage term in years
        System.out.print("\nEnter the number of years of the mortgage term: ");
        // store the user data
        year = in.nextDouble();
        
        // request the mortgage interest rate
        System.out.print("\nEnter the annual interest rate: ");
        // store the user data
        rate = (in.nextDouble() / 100);
        
        term = (year * 12.0);    // term in years * 12 months = number of monthly payments
        interest = rate/12.0;    // annual interest rate / 12 months = monthly intereset rate

        // calculate the monthly payment
        monthlyPayment = (amount * interest) / (1.0 - Math.pow((interest + 1.0), -term));

        // display the results
        System.out.printf("\nThe monthly mortgage payment is: $" + "%.2f%n", monthlyPayment);

        System.out.println("\n");

    }
}