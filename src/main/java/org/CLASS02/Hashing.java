package org.CLASS02;

import java.io.*;

public class Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int r = 31;
        int M = 1234567891;

        long hash = 0;
        long pow = 1;

        for (int i = 0; i < L; i++) {
            int val = input.charAt(i) - 'a' + 1;
            hash = (hash + val * pow) % M;
            pow = (pow * r) % M;
        }

        bw.write(hash + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
