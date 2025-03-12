package org.g15_약수_배수와_소수_2;

import java.io.*;
import java.math.*;

public class 다음_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long input = Long.parseLong(br.readLine());

            BigInteger c = BigInteger.valueOf(input);
            if (!c.isProbablePrime(10)) {
                c = c.nextProbablePrime();
            }

            bw.write(c.toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
