package com.bridgelabz.WhileLoop;
//Write a Program to reverse the integer number

import java.util.Scanner;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer Number: ");
        int num = scanner.nextInt();
        int rev = 0;
        int i = 0;
        while (num>=1){
            i = num%10;
            rev = rev*10 + i;
            num = num/10;
        }
        System.out.println("Reverse Number = "+rev);
    }
}
