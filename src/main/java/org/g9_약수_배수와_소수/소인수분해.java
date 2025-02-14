package org.g9_약수_배수와_소수;

import java.util.Scanner;

public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N != 1) {
            for (int i = 2; i <= N; i++) {
                while (N % i == 0) {
                    System.out.println(i);
                    N /= i;
                }
            }
        }
    }
}
