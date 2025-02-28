package org.g13_정렬;

import java.util.*;

public class 좌표정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] c = new int[N][2];

        for (int i = 0; i < N; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
        }

        Arrays.sort(c, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            } else {
                return x[0] - y[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(c[i][0] + " " + c[i][1]);
        }
    }
}
