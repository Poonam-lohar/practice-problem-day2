package com.bridgelabz;

import java.util.Scanner;

public class WhileLoopNaturalNumber {
    public static void main(String[] args)
    {
        int i=1;
        int sum=0;
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (i<=x)
        {
            System.out.print(" " +i);
            sum = sum+i;
            i++;
        }
        System.out.println("   Sum of natural numbers: " +sum);
    }
}
