package org.반복문;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();

        int temp = 0;

        for (int i = 0; i < count; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            temp += (a * b);

        };

        System.out.println(temp == total ? "Yes" : "No");
    }
}
