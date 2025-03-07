package org.g14_집합과_맵;

import java.util.*;
import java.io.*;

public class 숫자_카드_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> mine = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            mine.put(input, mine.getOrDefault(input, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            bw.write(mine.getOrDefault(input, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
