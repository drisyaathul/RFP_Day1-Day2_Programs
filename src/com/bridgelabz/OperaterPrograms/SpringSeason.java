package com.bridgelabz.OperaterPrograms;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month ,m : ");
        int m = scanner.nextInt();
        System.out.println("Enter the Day,d : ");
        int d = scanner.nextInt();

        if (m == 3 && d>=20 && d<=31) {
            System.out.println("True");
        }
        else if (m == 4 && d<=30) {
            System.out.println("True");
        }
        else if (m == 5 && d<=31) {
            System.out.println("True");
        }
        else if (m == 6 && d<=20) {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
