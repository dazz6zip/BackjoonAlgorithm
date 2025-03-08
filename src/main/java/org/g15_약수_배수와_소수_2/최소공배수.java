package org.g15_약수_배수와_소수_2;

import java.io.*;
import java.util.*;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int ta = A;
            int tb = B;

            while (tb != 0) {
                int t = ta % tb;
                ta = tb;
                tb = t;
            }

            bw.write(((A / ta) * B) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
