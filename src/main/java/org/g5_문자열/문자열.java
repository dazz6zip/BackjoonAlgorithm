package org.g5_문자열;

import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            System.out.println("" + input.charAt(0) + input.charAt(input.length() - 1));
        }
    }
}
