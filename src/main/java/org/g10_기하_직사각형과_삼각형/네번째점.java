package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            c1 ^= x;
            c2 ^= y;
        }

        System.out.println(c1 + " " + c2);
    }
}
