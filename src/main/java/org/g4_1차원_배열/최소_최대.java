package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 최소_최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
            min = Math.min(min, list.get(i));
        }

        System.out.println(min + " " + max);
    }
}
