package org.g5_문자열;

import java.util.Scanner;

public class 숫자의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        String input = sc.next();
        for (String s : input.split("")) {
            result += Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
