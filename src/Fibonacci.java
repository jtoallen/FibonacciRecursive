//Author: Jason Allen
//Date: 25 January 2021
//Project: Fibonacci Calculator
//Write a program fibonacci.java that recursively calculates the nth Fibonacci number.
// Prompt the user which Fibonacci number to calculate.
// Also, calculate the number of method calls and computer time is used for the calculation.
//    Example output

//    Which Fibonacci number would you like to calculate? 42
//    This Fibonacci number = 267914296
//    Number of method calls made = 866988873
//    Seconds used for this calculation = 4.292174803

import java.util.Scanner;

public class Fibonacci {

    static long recursionCount = 0;

    public static void main(String[] args) {
        System.out.println("Which Fibonacci number would you like to calculate? \r");
        Scanner in = new Scanner(System.in);
        long fibNum = in.nextLong();
        long BeginTime = System.currentTimeMillis();
        System.out.println("This fibonacci number = " + fibonacci(fibNum));
        long EndTime = System.currentTimeMillis();
        System.out.println("Number of method calls made = " + recursionCount);
        System.out.println("Seconds used for this calculation = " +
                (EndTime - BeginTime) / 1000.0);

//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));
//        System.out.println(fibonacci(4));
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci(6));
//        System.out.println(fibonacci(7));
//        System.out.println(fibonacci(8));
//        System.out.println(fibonacci(9));
//        System.out.println(fibonacci(10));
//        System.out.println(fibonacci(11));
    }

    public static long fibonacci(long num) {
//        recursive fibonacci method
//        each num is sum of previous 2 numbers
//        base case: num ==1 or num == 2
//        to count how many times function calls itself.
//        Chapter 6: system time. public class timer.java
//
        recursionCount += 1;

        if (num == 1 || num == 2) {
            return 1;
        }
//            this calls fib twice.  takes a long time.  not very efficient
        return fibonacci(num - 1) + fibonacci(num - 2);

    }
}



