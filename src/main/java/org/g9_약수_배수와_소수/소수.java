package org.g9_약수_배수와_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (i < 2) {
                continue;
            }

            boolean b = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(list.get(0));
        }
    }
}
