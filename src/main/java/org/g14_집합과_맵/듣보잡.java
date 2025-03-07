package org.g14_집합과_맵;

import java.io.*;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> list = new HashSet<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        Set<String> result = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (list.contains(input)) {
                result.add(input);
            }
        }

        bw.write(result.size() + "\n");
        for (String s : result) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
