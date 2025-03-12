package org.g15_약수_배수와_소수_2;

import java.io.*;

public class 베트르랑_공준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 123456 * 2;
        boolean[] pl = new boolean[max + 1];

        for (int i = 2; i <= max; i++) {
            pl[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (pl[i]) {
                for (int j = i * i; j <= max; j += i) {
                    pl[j] = false;
                }
            }
        }

        while (true) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (pl[i]) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
