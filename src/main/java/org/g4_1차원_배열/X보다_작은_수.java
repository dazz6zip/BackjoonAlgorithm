package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class X보다_작은_수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input < x) {
                list.add(input);
            }
        }

        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }
}
