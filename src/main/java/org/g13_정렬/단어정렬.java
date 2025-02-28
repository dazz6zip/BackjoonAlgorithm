package org.g13_정렬;

import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}
