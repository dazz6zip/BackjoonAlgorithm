package org.g11_시간_복잡도;

import java.util.Scanner;

public class 알고리즘수업_점근적표기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        sc.close();

        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}