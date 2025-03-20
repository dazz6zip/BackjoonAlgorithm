package org.CLASS01;

import java.io.*;
import java.util.StringTokenizer;

public class ACM_호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int rh = (int) Math.ceil(N % (double) H);
            int rw = (int) Math.ceil(N / (double) H);

            bw.write((rh == 0 ? H : rh) + String.format("%02d", rw) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
