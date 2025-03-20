package org.CLASS01;

import java.io.*;
import java.util.*;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = 0;
            int c = 1;
            for (String s : st.nextToken().split("")) {
                if (s.equals("O")) {
                    t += c;
                    c++;
                } else {
                    c = 1;
                }
            }
            bw.write(t + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
