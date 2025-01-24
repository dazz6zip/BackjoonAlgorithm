package org.g5_문자열;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder n = new StringBuilder();
        StringBuilder m = new StringBuilder();

        for (int i = 2; i >= 0; i--){
            String[] temp = input.split(" ");
            n.append(temp[0].charAt(i));
            m.append(temp[1].charAt(i));
        }

        System.out.println(Math.max(Integer.parseInt(n.toString()), Integer.parseInt(m.toString())));
    }
}
