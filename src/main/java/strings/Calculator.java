package main.java.strings;

import java.util.Scanner;

public class Calculator {

    /**
     * Print below in a loop
     *  Menu
     *  1. Add
     *  2. Subtract
     *  3. Multiple
     *  4. Division
     *  5. Exit
     *
     *  Input: 1
     *  Enter numbers: 1 2
     *  take the string and split by " " and take 2 numbers out of this input.
     *  num1 = 1
     *  num2 = 2
     *  output = 3
     *
     */

    private static void calculatorTest() {
        // Start an infinite loop and print the menu.
        // if the user chooses 5, then you exit the loop.
        // once this is done...
        // accept the numbers in a string
        // split them
        // and then add the numbers if the user chose 'Add'
        while(true){
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiple");
            System.out.println("4.Division");
            System.out.println("5.exit");

            System.out.print("enter a choice: ");
            Scanner sc = new Scanner(System.in);
            int choice= sc.nextInt();
            if (choice==5){
                break;
            }
            if (choice==1){
                add();
            }
            if (choice==2){
                Subtract();
            }
            if (choice==3){
                Multiple();
            }
            if (choice==4){
                Division();
            }


        }
    }
    private static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

    }
    private static void Subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

    }
    private static void Multiple(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

    }
    private static void Division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        if(num2==0){
            System.out.println("cannot be divide by 0");
        }else{
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
    }

    public static void main(String[] args) {
        calculatorTest();
    }
}
