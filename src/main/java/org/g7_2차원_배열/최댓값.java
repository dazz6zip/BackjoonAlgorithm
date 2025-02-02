package org.g7_2차원_배열;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] g = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                g[i][j] = sc.nextInt();
                if (g[i][j] > max) {
                    max = g[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max + "\n" + (x + 1) + " " + (y + 1));
    }
}
