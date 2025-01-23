package org.g5_문자열;

import java.util.Scanner;

public class 문자열_반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");

            StringBuilder result = new StringBuilder();
            for (char c : input[1].toCharArray()) {
                for (int j = 0; j < Integer.parseInt(input[0]); j++) {
                    result.append(c);
                }
            }
            System.out.println(result);
        }
    }
}
