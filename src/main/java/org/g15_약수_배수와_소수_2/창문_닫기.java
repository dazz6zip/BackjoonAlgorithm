package org.g15_약수_배수와_소수_2;

import java.io.*;

public class 창문_닫기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(Integer.toString((int) Math.sqrt(N)));

        bw.flush();
        bw.close();
        br.close();
    }
}
