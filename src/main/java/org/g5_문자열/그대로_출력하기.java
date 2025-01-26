package org.g5_문자열;

import java.util.Scanner;

public class 그대로_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
    }
}
