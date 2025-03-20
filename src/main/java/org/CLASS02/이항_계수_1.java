package org.CLASS02;

import java.io.*;
import java.util.*;

public class 이항_계수_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int r = 1;

        for (int i = 0; i < K; i++) {
            r *= (N - i);
            r /= (i + 1);
        }
        bw.write(String.valueOf(r));

        bw.flush();
        bw.close();
        br.close();
    }
}
