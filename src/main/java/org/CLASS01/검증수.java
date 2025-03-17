package org.CLASS01;

import java.io.*;
import java.util.*;

public class 검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            t += (int) Math.pow(n, 2);
        }

        bw.write(t % 10 + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
