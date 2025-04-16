package org.CLASS02;

import java.io.*;
import java.util.*;

public class 요세푸스_문제_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int c = 0;
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (c == (K - 1)) {
                    result.add(list.get(i));
                    list.remove(i);

                    c = 0;
                    i -= 1;

                } else {
                    c++;
                }
            }
        }

        bw.write("<");
        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + "");
            if (i != result.size() - 1) {
                bw.write(", ");
            }
        }
        bw.write(">");

        bw.flush();
        bw.close();
        br.close();
    }
}
