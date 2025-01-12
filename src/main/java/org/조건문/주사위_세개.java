package org.조건문;

import java.util.Scanner;

public class 주사위_세개 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        int result = 0;

        if (input1 == input2 && input2 == input3) {
            result = 10000 + input1 * 1000;
        } else if (input1 == input2 || input2 == input3 || input1 == input3) {
            int same = input1 == input2 ? input1 : input3;
            result = 1000 + same * 100;
        } else {
            int max = Math.max(input1, input2);
            max = Math.max(max, input3);
            result = max * 100;
        }
        System.out.println(result);
    }
}
