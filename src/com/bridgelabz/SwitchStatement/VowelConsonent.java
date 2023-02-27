package com.bridgelabz.SwitchStatement;
//To Check Vowel or Consonant

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Charracter : ");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is a Vowel.");
                break;
                default:
                System.out.println(ch+" is a Consonent.");
        }

    }
}
