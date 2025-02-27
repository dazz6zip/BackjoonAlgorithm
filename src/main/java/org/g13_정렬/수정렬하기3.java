package org.g13_정렬;

import java.io.*;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] c = new int[10001];

        for (int i = 0; i < N; i++) {
            c[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (c[i] > 0) {
                bw.write(i + "\n");
                c[i]--;
            }
        }

        bw.flush();
    }
}
