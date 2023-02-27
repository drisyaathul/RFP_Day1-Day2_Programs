package com.bridgelabz;

import java.util.Scanner;

public class StaticMVB {
public static int m1(int a, int b){
    int prod = a * b;
    return prod;
}
public static int m2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first value : ");
    int x = scanner.nextInt();
    System.out.println("Enter the Second Value : ");
    int y = scanner.nextInt();
    int add = x + y;
    System.out.println(add);
    return add;
}

    static void Variable(int x, int var){
        System.out.println(x);
        System.out.println(var);
    }


    public static void main(String[] args) {
        int prod= m1(5, 5);
        System.out.println("prod1 :" + prod);
        System.out.println("----------------------");
        m2();
        System.out.println("----------------------");
        int x = 15;
        System.out.println(x);
        System.out.println(args[0]);
        Variable(15,50);
    }
}
