package org.w1_단기간_성장;

import java.io.*;
import java.util.*;

public class 평범한_배낭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] W = new int[N];
        int[] V = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        int[] t = new int[K + 1];
        for (int i = 0; i < N; i++) {
            for (int j = K; j >= W[i]; j--) {
                t[j] = Math.max(t[j], t[j - W[i]] + V[i]);
            }
        }

        bw.write(Integer.toString(t[K]));
        bw.flush();
        bw.close();
        br.close();
    }
}
