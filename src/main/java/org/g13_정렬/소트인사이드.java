package org.g13_정렬;

import java.util.*;

public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.next().split("");

        List<Integer> list = new ArrayList<>();
        for (String n : N) {
            list.add(Integer.parseInt(n));
        }

        list.sort(Comparator.reverseOrder());
        list.forEach(l -> System.out.print(l));
    }
}
