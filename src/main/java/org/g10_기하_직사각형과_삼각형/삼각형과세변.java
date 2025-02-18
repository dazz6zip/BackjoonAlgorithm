package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 삼각형과세변 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = sc.nextLine();

            if (s.equals("0 0 0")) {
                break;
            }

            String[] scv = s.split(" ");

            int a = Integer.parseInt(scv[0]);
            int b = Integer.parseInt(scv[1]);
            int c = Integer.parseInt(scv[2]);

            int max = Math.max(Math.max(a, b), c);
            int oth = a + b + c - max;

            if (max >= oth) {
                sb.append("Invalid").append("\n");
            } else if (a == b && b == c) {
                sb.append("Equilateral").append("\n");
            } else if (a == b || b == c || c == a) {
                sb.append("Isosceles").append("\n");
            } else {
                sb.append("Scalene").append("\n");
            }


        }

        System.out.println(sb.toString());
    }
}
