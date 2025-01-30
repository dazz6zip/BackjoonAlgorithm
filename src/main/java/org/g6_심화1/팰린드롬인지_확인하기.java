package org.g6_심화1;

import java.util.Scanner;

public class 팰린드롬인지_확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean b = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                b = false;
                break;
            }
        }

        System.out.println(b ? 1 : 0);
    }
}
