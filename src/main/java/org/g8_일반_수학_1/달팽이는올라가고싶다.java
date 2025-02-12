package org.g8_일반_수학_1;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int g = V - A;
        int d = A - B;
        System.out.println((g + d - 1) / d + 1);
    }
}
