package org.g4_1차원_배열;

import java.util.*;

public class 바구니_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            List<Integer> temp = list.subList(a - 1, b);
            Collections.reverse(temp);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
