package org.g12_브루트_포스;

import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();
        String input = sc.nextLine();

        long temp = 0;

        for (String i : input.split(" ")) {
            int it = Integer.parseInt(i);
            for (String j : input.split(" ")) {
                int jt = Integer.parseInt(j);
                for (String k : input.split(" ")) {
                    int kt = Integer.parseInt(k);
                    if (it + jt + kt <= M && it != jt && it != kt && jt != kt) {
                        temp = Math.max(temp, it + jt + kt);
                    }
                }
            }
        }

        System.out.println(temp);
    }
}
