package org.CLASS02;

import java.io.*;

public class 팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            boolean b = false;
            for (int i = 0; i < (input.length() / 2); i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    bw.write("no\n");
                    b = true;
                    break;
                }
            }
            if (!b) {
                bw.write("yes\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
