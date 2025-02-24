package org.g12_브루트_포스;

import java.util.Scanner;

public class 체스판다시칠하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] c = new char[N][M];

        for (int i = 0; i < N; i++) {
            c[i] = sc.nextLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int w = 0;
                int b = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (c[i + x][j + y] != 'W') {
                                w++;
                            }
                            if (c[i + x][j + y] != 'B') {
                                b++;
                            }
                        } else {
                            if (c[i + x][j + y] != 'B') {
                                w++;
                            }
                            if (c[i + x][j + y] != 'W') {
                                b++;
                            }
                        }
                    }
                }

                min = Math.min(min, Math.min(w, b));
            }
        }

        System.out.println(min);
    }
}
