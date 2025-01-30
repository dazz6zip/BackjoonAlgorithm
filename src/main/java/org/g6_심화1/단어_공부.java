package org.g6_심화1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어_공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();

        List<Integer> list = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            list.add(0);
        }

        for (String s : input.split("")) {
            list.set(s.charAt(0) - 'A', list.get(s.charAt(0) - 'A') + 1);
        }

        int max = 0;
        String result = "?";

        for (int i = 0; i < 26; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                result = String.valueOf((char)(i + 'A'));
            } else if (list.get(i) == max) {
                result = "?";
            }
        }

        System.out.println(result);
    }
}
