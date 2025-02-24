package org.g12_브루트_포스;

import java.util.Scanner;

public class 수학은비대면강의입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int[] result = new int[2];

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                long a = Long.parseLong(input[0]);
                long b = Long.parseLong(input[1]);
                long c = Long.parseLong(input[2]);
                long d = Long.parseLong(input[3]);
                long e = Long.parseLong(input[4]);
                long f = Long.parseLong(input[5]);

                if (a * i + b * j == c && d * i + e * j == f) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        System.out.println(result[0] + " " + result[1]);
    }
}
