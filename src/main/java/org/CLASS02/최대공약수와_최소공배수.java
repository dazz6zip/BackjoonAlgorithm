package org.CLASS02;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int gdc = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();

        bw.write(gdc + "\n");
        bw.write((n * m) / gdc + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
