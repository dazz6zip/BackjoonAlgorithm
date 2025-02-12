package org.g8_일반_수학_1;

import java.util.Scanner;

public class 중앙이동알고리즘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 4;
        for (int i = 0; i < N; i++) {
            int temp = (int)Math.sqrt(result);
            result = (int) Math.pow(temp + (temp - 1), 2);
        }
        System.out.println(result);
    }
}
