package org.g2_조건문;

import java.util.Scanner;

public class 두_수_비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] t = input.split(" ");

        int a = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[1]);

        String r = ">";

        if (a == b) {
            r = "==";
        } else if (a < b) {
            r = "<";
        }

        System.out.println(r);
    }
}
