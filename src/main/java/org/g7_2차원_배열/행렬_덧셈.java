package org.g7_2차원_배열;

import java.util.Scanner;

public class 행렬_덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] inputList = new int[n][m];

        for (int i = 0; i < n + n; i++) {
            for (int j = 0; j < m; j++) {
                inputList[i % n][j] += sc.nextInt();
            }
        }

        for (int[] list : inputList) {
            for (int l : list) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
