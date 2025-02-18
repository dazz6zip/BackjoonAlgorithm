package org.g10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class 직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        System.out.println(Math.min(Math.min(x, w-x), Math.min(y, h-y)));
    }
}