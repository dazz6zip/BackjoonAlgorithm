package org.g7_2차원_배열;

import java.util.*;

public class 세로읽기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String[]> list = new ArrayList<>();

        int l = 0;
        for (int i = 0; i < 5; i++) {
            String[] s = sc.nextLine().split("");
            list.add(s);
            l = Math.max(l, s.length);

        }

        for (int i = 0; i < l; i++) {
            for (String[] s : list) {
                if (i < s.length && !s[i].equals(" ")) {
                    System.out.print(s[i]);
                }
            }
        }
    }
}