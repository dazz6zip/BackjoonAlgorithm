package org.조건문;

import java.util.Scanner;

public class 시험_성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String final_score = "F";

        if (score >= 90) {
            final_score = "A";
        } else if (score >= 80) {
            final_score = "B";
        } else if (score >= 70) {
            final_score = "C";
        } else if(score >= 60) {
            final_score = "D";
        }

        System.out.println(final_score);
    }
}
