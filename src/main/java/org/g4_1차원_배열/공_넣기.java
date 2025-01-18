package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 공_넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        for (int i = 0; i < m; i++) {
            int ii = sc.nextInt();
            int ij = sc.nextInt();
            int ik = sc.nextInt();

            for (int j = ii - 1; j < ij; j++) {
                list.set(j, ik);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }
}
