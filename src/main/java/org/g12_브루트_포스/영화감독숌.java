package org.g12_브루트_포스;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int c = 0;
        int t = 666;

        while (true) {
            if (String.valueOf(t).contains("666")) {
                c++;
                if (c == N) {
                    System.out.println(t);
                    break;
                }
            }
            t++;
        }
    }

}
