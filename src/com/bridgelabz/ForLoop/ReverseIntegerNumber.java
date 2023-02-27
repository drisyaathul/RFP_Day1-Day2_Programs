package com.bridgelabz.ForLoop;
//reverse the integer number

import java.util.Scanner;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = scanner.nextInt();
        int rev = 0;
        for (int i = 0; num >= 1; i++) {
            i = num % 10;
            rev = rev * 10 + i;
            num = num / 10;
        }
        System.out.println("The Reverse Number = " + rev);
    }
}




