package org.CLASS01;

import java.io.*;

public class ABC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        bw.write((A + B - C) + "\n");
        bw.write(String.valueOf(Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C));

        bw.flush();
        bw.close();
        br.close();
    }
}
