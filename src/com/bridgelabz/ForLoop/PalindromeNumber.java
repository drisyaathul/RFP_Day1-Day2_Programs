package com.bridgelabz.ForLoop;
//find Palindrome Number(p)

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int p = number;
        for(int i=0; number>=1; i++){
            i = number%10;
            reverse = reverse*10 + i;
            number = number/10;
        }
        if(p==reverse){
            System.out.println("The Number is a Palindrome");
        }else
            System.out.println(p+"The Number is not a Palindrome");

    }
}
