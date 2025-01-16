package org.g3_반복문;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 1; i < 10; i ++) {
            System.out.println(input + " * " + i + " = " + input*i);
        }
    }
}
