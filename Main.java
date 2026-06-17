package com.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter table no: ");
        int n = sc.nextInt();
        int i = 10;
        
        while (i >= 1) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i--;
        }
        
        sc.close();
    }
}
