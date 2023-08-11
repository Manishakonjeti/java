package com.takeo.day4;


import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
System.out.println("enter your age");
        int age= scanner.nextInt();


        if( age >0 && age<13) {
            System.out.println("child");
        }
        else if (age>13 && age <=30) {
            System.out.println("young");

            
        } else if (  age>30 && age <=50) {
            System.out.println("middle");


        } else if ( age <=100) {
            System.out.println("old");
        }
        else if ( age == 0) {
            System.out.println( "please enter a valid age");
        }
    }
}
