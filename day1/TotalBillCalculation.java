package com.TakeoDay2;

//Exercise 3: Total Bill Calculation
     //   Scenario: You are developing a restaurant bill calculation application. You need to implement a feature that calculates the total bill amount, including tax and tip.
    //    Given : Bill amount = 30, Taxes = 15, Tip  = 10
      //  Task: Write a program that calculates the total bill amount by adding the bill amount, tax and tip.

public class TotalBillCalculation {
    public static void main(String[] args) {
        int BillAmount =30;
        int Taxes=15;
        int tip =10;
        int totalbill= BillAmount + Taxes + tip;
        System.out.println("the total bill amount by adding the bill amount, tax and tip is"+ " "+ totalbill);
    }

}
