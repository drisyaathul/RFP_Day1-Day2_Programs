package com.bridgelabz.OperaterPrograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter value: ");
        int a = scanner.nextInt();
        System.out.println("Enter value: ");
        int b = scanner.nextInt();
        System.out.println("Enter value: ");
        int c = scanner.nextInt();

        double d=(b*b-4*a*c);
        if(d>0){
            double r1=b+Math.sqrt(d)/(2*a);
            double r2=b-Math.sqrt(d)/(2*a);
            System.out.println("The roots are: " + r1 + " and " + r2);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}
