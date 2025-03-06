package org.g13_정렬;

import java.util.*;

public class 좌표압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            s.add(a[i]);
        }

        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            m.put(l.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(m.get(a[i])).append(" ");
        }
        System.out.println(sb);
    }
}
