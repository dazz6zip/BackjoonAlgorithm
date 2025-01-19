package org.g5_문자열;

import java.util.Scanner;

public class 문자와_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();

        String[] temp = s.split("");
        System.out.println(temp[i - 1]);
    }
}
