package main.java.functions;

import java.util.Scanner;

public class Functions {

    /**
     *  Any code that is mostly repetitive, then it can be wrapped inside a function.
     *  Or if the code / statements are too long and to make them more readable, we
     *  simply put the statements in a function and call the function.
     *
     */

    private static boolean isEven( int x ) {
        if ( x % 2 == 0 )
            return true;
        else
            return false;
    }

    private static boolean isPrime( int number ) {
        // +ve numbers only.
        // 1,2 are not primes.
        // a number divisible by 1 and itself.

        if ( number <= 0 || (number >= 1 && number <= 2 ) ) {
            return false;
        }

        if ( isEven( number ) ) {
            return false;
        }

        // now, check from 3 onwards to the number itself.
        // 3, 4 (s), 5, 6 (s), 7, 8 (s)
        for ( int i = 3; i < number; i += 2 ) {
            if ( number % i == 0 )
                return false;
        }
        return true;
    }

    private static void primeTest() {
        // 3 is a prime
        // 4 is not a prime
        System.out.println( "3 is a Prime: " + isPrime(3 ) );
        System.out.println( "4 is a Prime: " + isPrime(4 ) );
        System.out.println( "5 is a Prime: " + isPrime(5 ) );
        System.out.println( "15 is a Prime: " + isPrime(15 ) );
        System.out.println( "17 is a Prime: " + isPrime( 17 ) );
    }
    private static int factorial( int number ) {
        // 5! = 5 * 4 * 3 * 2 * 1
        // if  we want to calculate only +ve numbers. else we return 0.

        if ( number <= 0 )
            return 0;

        int result = 1;
        for ( ; number > 1; --number ) {
            result *= number;
        }
        return result;
    }

    private static void calculateFactorial() {
        System.out.println("Factorial of 5: " + factorial( 5 ) );
        System.out.println("Factorial of 3: " + factorial( 3 ) );
        System.out.println("Factorial of -1: " + factorial( -1 ) );
    }


    public static void main(String[] args) {

        // if we want to print whether a value is even or odd.
        // evenSums();
        // calculateFactorial();
        primeTest();
    }

    private static void evenSums() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if ( x % 2 == 0 ) {
            System.out.println( x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        // take 5 numbers, sum only even numbers.


        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int x5 = scanner.nextInt();

        int sum = 0;
        if ( x1 % 2 == 0) {
            sum += x1;
        }
        if ( x2 % 2 == 0 ) {
            sum += x2;
        }
        if ( x3 % 2 == 0) {
            sum += x3;
        }
        if ( x4 % 2 == 0 ) {
            sum += x4;
        }
        if ( x5 % 2 == 0) {
            sum += x5;
        }

        System.out.println( "Sum of evens:" + sum);

        // take 10000 numbers, sum only even numbers.
        // what should we do in this case?

        // data types, loops, conditions.
        sum = 0;
        for ( int i = 1; i <= 5; ++i ) {
            x = scanner.nextInt();
            if ( isEven( x ) ) {
                sum += x;
            }
        }
        System.out.println( "Sum of evens: " + sum );
    }
}
