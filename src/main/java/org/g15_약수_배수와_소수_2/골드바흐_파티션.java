package org.g15_약수_배수와_소수_2;

import java.io.*;

public class 골드바흐_파티션 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 1_000_000;
        boolean[] b = new boolean[max + 1];

        for (int i = 2; i <= max; i++) {
            b[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (b[i]) {
                for (int j = i * i; j <= max; j += i) {
                    b[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for (int a = 2; a <= N / 2; a++) {
                if (b[a] && b[N - a]) {
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
