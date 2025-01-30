package org.g6_심화1;

import java.util.Scanner;

public class 별_찍기_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            printProc(input, i);
            System.out.println();
        }
        for (int i = input - 2; i >= 0; i--) {
            printProc(input, i);
            System.out.println();
        }
    }

    public static void printProc(int input, int temp) {
        for (int j = 0; j < input - temp - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= temp * 2; j++) {
            System.out.print("*");
        }
    }
}
