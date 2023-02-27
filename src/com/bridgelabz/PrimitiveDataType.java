package com.bridgelabz;

//Write a Java program to display the default value of all primitive data types of Java

public class PrimitiveDataType {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g ;
    boolean h;

    public static void main(String[] args) {

        PrimitiveDataType obj = new PrimitiveDataType ();
        System.out.println("The Default value of byte is " +obj.a);
        System.out.println("The Default value of short is " +obj.b);
        System.out.println("The Default value of int is " +obj.c);
        System.out.println("The Default value of long is " +obj.d);
        System.out.println("The Default value of float is " +obj.e);
        System.out.println("The Default value of double is " +obj.f);
        System.out.println("The Default value of char is " +obj.g);
        System.out.println("The Default value of boolean is " +obj.h);
    }

}
