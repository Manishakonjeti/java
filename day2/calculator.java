package com.takeoday3;
//
//xercise 6: Design a calulator which perform a set of operations dynamically.
  //      Scenario: Design a Calculator class. Take inpit from user like :
   //     Enter first number = 5
     //   Enter Second number = 5
      //  Enter Operation you want to perform = +

       // Outupt of Program will be like this :

      //  Output: 5+5 = 10;

       // Hint :   take input by using Scanner class
//take operation(+,-,*,/) as String input from the console
     //   use if else cases to compare operation with constant String like : final String SUM = "+"; similar for other
   //     then inside if do the required operation

import java.util.Scanner;

//     print the output.
public class calculator {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter first number :");
           int number1 = scanner.nextInt();
           System.out.println("Enter second number :");
           int number2 = scanner.nextInt();
           System.out.println("Enter operator  :");
           String operator = scanner.next();
           if (operator.equals("+" )) {
               System.out.println(" sum of operators: " + number1 + number2);
           } else if (operator .equals("-")) {
               System.out.println(" sub of operators:" + (number1 - number2));

           } else if (operator.equals("*")) {
               System.out.println(" mul of operators: " + number1 * number2);


           } else if (operator.equals( "/")) {
               System.out.println(" div of operators: " + number1 / number2);


           }
           scanner.close();
       }

       }