package org.g5_문자열;

import java.util.Scanner;

public class 단어의_개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] inputConvert = input.split(" ");

        if (input.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(inputConvert.length);
        }
    }
}
