package com.bridgelabz.IfElse;
//Read a Number 1,10,100,1000 and display unit, ten, hundred, thousand

import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = scanner.nextInt();
        if(n==1){
            System.out.println("Unit");
        } else if (n==10) {
            System.out.println("Ten");
        } else if (n==100) {
            System.out.println("Hundred");
        } else if (n==1000) {
            System.out.println("Thousand");
        }
    }
}
