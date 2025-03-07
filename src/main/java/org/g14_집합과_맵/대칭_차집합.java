package org.g14_집합과_맵;

import java.io.*;
import java.util.*;

public class 대칭_차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> bCopy = new HashSet<>(B);

        for (Integer a : A) {
            bCopy.remove(a);
        }

        for (Integer b : B) {
            A.remove(b);
        }

        bw.write((bCopy.size() + A.size()) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
