package com.bridgelabz.ForLoop;
//Write a Program for the sum of n natural numbers

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scanner.nextInt();

        int sum=0;
        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of the Numbers= "+sum);
    }
}
