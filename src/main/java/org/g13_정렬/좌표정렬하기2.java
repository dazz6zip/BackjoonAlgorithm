package org.g13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] c = new int[N][2];

        for (int i = 0; i < N; i++) {
            c[i][0] = in.nextInt();
            c[i][1] = in.nextInt();
        }

        Arrays.sort(c, (x, y) -> {
            if (x[1] == y[1]) {
                return x[0] - y[0];
            } else {
                return x[1] - y[1];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(c[i][0] + " " + c[i][1]);
        }
    }
}
