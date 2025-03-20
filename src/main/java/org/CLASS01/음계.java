package org.CLASS01;

import java.io.*;
import java.util.*;

public class 음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean a = true;
        boolean d = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 9; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x != i) {
                a = false;
            }
            if (x != 9 - i) {
                d = false;
            }
        }

        if (a) {
            bw.write("ascending");
        } else if (d) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
