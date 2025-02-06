package org.g7_2차원_배열;

import java.util.Scanner;

public class 색종이 {
    public static void main(String[] args) {
        boolean[][] background = new boolean[100][100];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            for (int j = Integer.parseInt(input[0]); j < Integer.parseInt(input[0]) + 10; j++) {
                for (int k = Integer.parseInt(input[1]); k < Integer.parseInt(input[1]) + 10; k++) {
                    if(!background[j][k]) {
                        background[j][k] = true;
                    }
                }
            }
        }

        int count = 0;
        for (boolean[] bg : background) {
            for (boolean b : bg) {
                if (b) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
