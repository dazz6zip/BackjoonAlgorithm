package org.반복문;

import java.util.Scanner;

public class 합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result = 0;

        for (int i = 1 ; i <= input ; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
