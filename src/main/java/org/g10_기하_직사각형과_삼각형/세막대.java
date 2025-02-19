package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 세막대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m = Math.max(Math.max(a, b), c);
        int result = 0;
        int t = a + b + c - m;
        if (t <= m) {
            result += t + (t - 1);
        } else {
            result += (a + b + c);
        }

        System.out.println(result);
    }
}
