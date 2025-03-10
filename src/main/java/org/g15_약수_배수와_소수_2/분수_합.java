package org.g15_약수_배수와_소수_2;

import java.io.*;
import java.math.*;
import java.util.*;

public class 분수_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 분수 덧셈
        // 분자 A * D + C * B
        // 분모 B * D
        int A = a * d + c * b;
        int B = b * d;

        // BigInteger gcd -> 최대공약수
        // int를 BigInteger 형식으로 변환
        // output 은 int 로
        int gcd = BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue();

        A /= gcd;
        B /= gcd;

        bw.write(A + " " + B);
        bw.flush();
        bw.close();
        br.close();
    }
}
