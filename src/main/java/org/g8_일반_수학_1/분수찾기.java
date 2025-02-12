package org.g8_일반_수학_1;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int A = 1;
        int B = 1;
        int s = 1;
        int c = 0;
        for (int i = 1; i < X; i++) {
            c++;
            if (c == s) {
                s++;
                c = 0;
            }
            if (s % 2 == 1) {
                A = s - c;
                B = c + 1;
            } else {
                A = c + 1;
                B = s - c;
            }
        }
        System.out.println(A + "/" + B);
    }
}
