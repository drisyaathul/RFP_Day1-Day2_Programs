package com.bridgelabz.OperaterPrograms;

import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner. nextDouble();
        System.out.println("Enter the value of y: ");
        double y = scanner. nextDouble();
        double distance = 0;
        //origin(0,0)
        distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The Distance is "+distance);
    }
}
