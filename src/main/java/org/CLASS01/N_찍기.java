package org.CLASS01;

import java.io.*;

public class N_찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
