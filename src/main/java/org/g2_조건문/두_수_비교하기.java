package org.g2_조건문;

import java.util.Scanner;

public class 두_수_비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] result;
        int result_a, result_b;
        result = input.split(" ");

        result_a = Integer.parseInt(result[0]);
        result_b = Integer.parseInt(result[1]);

        String final_result = ">";

        if (result_a == result_b) {
            final_result = "==";
        } else if (result_a < result_b) {
            final_result = "<";
        }

        System.out.println(final_result);
    }
}
