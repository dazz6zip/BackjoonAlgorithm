package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 대지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int x1 = 10001;
        int x2 = -10001;
        int y1 = 10001;
        int y2 = -10001;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            x1 = Math.min(x1, a);
            x2 = Math.max(x2, a);
            y1 = Math.min(y1, b);
            y2 = Math.max(y2, b);
        }

        System.out.println((x2 - x1) * (y2 - y1));
    }
}
