package org.g5_문자열;

import java.util.*;

public class 알파벳_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 'a'; i <= 'z'; i++) {
            map.put((char)i, -1);
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == i) {
                    map.put((char) i, j);
                    break;
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
