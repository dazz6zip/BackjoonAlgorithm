package org.g8_일반_수학_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int q = C / 25;
            C %= 25;
            int d = C / 10;
            C %= 10;
            int n = C / 5;
            C %= 5;
            int p = C;
            result.add(new int[]{q, d, n, p});
        }

        for (int[] r : result) {
            for (int i : r) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
