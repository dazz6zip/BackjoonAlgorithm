package org.반복문;

import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a + b);
        }
    }
}
