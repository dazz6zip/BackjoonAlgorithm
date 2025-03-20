package org.CLASS01;

import java.io.*;
import java.util.*;

public class 숫자의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String r = Integer.toString(A * B * C);

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
            for (int j = 0; j < r.length(); j++) {
                if (i == r.charAt(j) - '0') {
                    map.put(i, map.get(i) + 1);
                }
            }
        }

        for (Integer v : map.values()) {
            bw.write(v + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
