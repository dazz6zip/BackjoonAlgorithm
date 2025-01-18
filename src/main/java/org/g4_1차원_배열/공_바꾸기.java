package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 공_바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        for (int i = 0; i < m; i++) {
            int ii = sc.nextInt() - 1;
            int ij = sc.nextInt() - 1;

            int tempI = list.get(ii);
            int tempJ = list.get(ij);

            list.set(ii, tempJ);
            list.set(ij, tempI);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
