package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 개수_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        int m = sc.nextInt();

        int result = 0;

        for (Integer l : list) {
            if (m == l) {
                result++;
            }
        }

        System.out.println(result);
    }
}
