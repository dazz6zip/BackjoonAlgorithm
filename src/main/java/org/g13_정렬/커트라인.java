package org.g13_정렬;

import java.util.*;

public class 커트라인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(k - 1));
    }
}
