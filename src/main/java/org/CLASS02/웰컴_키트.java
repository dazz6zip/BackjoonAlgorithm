package org.CLASS02;

import java.io.*;
import java.util.*;

public class 웰컴_키트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = new int[6];
        for (int i = 0; i < 6; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int c = 0;
        for (int size : s) {
            c += (size + T - 1) / T;
        }

        int pc1 = N / P;
        int pc2 = N % P;

        bw.write(c + "\n");
        bw.write(pc1 + " " + pc2 + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
