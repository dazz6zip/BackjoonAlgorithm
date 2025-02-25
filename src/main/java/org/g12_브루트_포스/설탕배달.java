package org.g12_브루트_포스;

import java.util.*;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int c = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                c += N / 5;
                break;
            }
            N -= 3;
            c++;
        }
        System.out.println(N < 0 ? -1 : c);
    }
}
