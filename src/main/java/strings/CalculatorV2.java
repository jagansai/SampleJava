package main.java.strings;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * In Version 1, we asked the user to enter the numbers 1 after the other.
 * It worked fine, but it was not quite natural. User was asked to enter few choices and then there was a reply.
 * Instead, how about asking the user to make the calculations in  an expression format?
 *
 * For e.g. User enters like 👇🏻
 *
 *  > 1 + 2 ( Enter )
 *  > 3
 *  > 2 - 1 ( Enter )
 *  > 1
 *
 */
public class CalculatorV2 {

    public static void main(String[] args) {
        calculatorTest();
    }

    private static void calculatorTest() {

        Scanner sc = new Scanner(  System.in );

        while ( true ) {
            System.out.print("Enter expression : ");
            String expression = sc.nextLine();

            String[] strings = expression.split(" ");

            // Now, the first in the cell, is a number
            // Last in the cell is a number
            // the middle is an operation.

            int num1 = Integer.parseInt(strings[0]);
            int num2 = Integer.parseInt(strings[strings.length - 1]);
            String operation = strings[1];
            switch (operation) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    break;
            }
        }
    }

}
