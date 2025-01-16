package org.g2_조건문;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_year = sc.nextInt();
        int result = 0;
        if (input_year % 4 == 0 && input_year % 100 != 0 || input_year % 400 == 0) {
            result = 1;
        }

        System.out.println(result);
    }
}
