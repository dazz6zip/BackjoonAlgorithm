package org.g9_약수_배수와_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 약수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        System.out.println(list.size() < K ? 0 : list.get(K - 1));
    }
}
