package org.g3_반복문;

import java.util.Scanner;

public class 코딩은_체육과목_입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 0; i < input / 4 ; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
