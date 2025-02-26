package org.g13_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 대표값2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            list.add(n);
            t += n;

        }

        Collections.sort(list);

        System.out.println(t / 5);
        System.out.println(list.get(2));
    }
}
