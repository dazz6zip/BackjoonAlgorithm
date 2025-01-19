package org.g4_1차원_배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = Collections.max(list);

        double result = 0;
        for (Integer i : list) {
            result += ((double) i / max) * 100;
        }

        System.out.println(result / n);
    }
}
