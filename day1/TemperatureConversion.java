package com.TakeoDay2;

//Exercise 1: Temperature Conversion
       // Scenario: You are building a weather application, and you need to implement a feature that converts temperature values from Celsius to Fahrenheit.
        //Given : You can take temperature of your city in Celsisus.
        //Task: Write a program that converts Celsisus to Fahrenheit using the formula (Celsius * 9/5) + 32, and prints the converted temperature.
// use proper data type for this as we can have decimal value there.

public class TemperatureConversion {
    public static void main(String[] args) {
        int tempCity= 80;
        System.out.println("the temperature of the city  in "+ (tempCity* 9/5) + 32 + " " + " Fahrenheit");

    }

}
