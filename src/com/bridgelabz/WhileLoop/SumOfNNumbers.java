package com.bridgelabz.WhileLoop;
//Write a Program for the sum of n natural numbers

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of the Numbers = " +sum);
    }
}
