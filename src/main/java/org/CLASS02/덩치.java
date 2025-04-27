package org.CLASS02;

import java.io.*;
import java.util.*;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer[]> specs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            specs.add(new Integer[]{w, h});
        }

        for (int i = 0; i < N; i++) {
            int c = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (specs.get(j)[0] > specs.get(i)[0] && specs.get(j)[1] > specs.get(i)[1]) {
                    c++;
                }
            }
            bw.write(c + 1 + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
