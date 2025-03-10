package org.g15_약수_배수와_소수_2;

import java.io.*;
import java.util.*;

public class 최소공배수_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long ta = A;
        long tb = B;

        while (tb != 0) {
            long t = ta % tb;
            ta = tb;
            tb = t;
        }

        bw.write(((A / ta) * B) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
