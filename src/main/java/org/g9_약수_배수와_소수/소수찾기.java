package org.g9_약수_배수와_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            boolean b = true;
            for (int j = 2; j < input; j++) {
                if (input % j == 0) {
                    b = false;
                }
            }
            if (b && input > 1) {
                list.add(input);
            }
        }

        System.out.println(list.size());
    }
}
