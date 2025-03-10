package org.g15_약수_배수와_소수_2;

import java.io.*;
import java.util.*;

public class 가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> ts = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ts.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> wts = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            wts.add(ts.get(i) - ts.get(i - 1));
        }

        // 간격의 최대공약수 계산
        int t = wts.get(0);
        for (int i = 1; i < wts.size(); i++) {
            int a = t;
            int b = wts.get(i);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            t = a;
        }

        int c = 0;
        for (int w : wts) {
            c += (w / t) - 1;
        }

        bw.write(c + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
