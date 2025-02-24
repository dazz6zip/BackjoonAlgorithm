package org.g12_브루트_포스;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;
        for (int i = 0; i < N; i++) {
            int t = 0;
            String[] str = Integer.toString(i).split("");
            for (String s : str) {
                t += Integer.parseInt(s);
            }
            if (i + t == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
