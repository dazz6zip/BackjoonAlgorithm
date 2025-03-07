package org.g14_집합과_맵;

import java.io.*;
import java.util.*;

public class 나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            map1.put(input, i);
            map2.put(i, input);
        }

        for (int i = 1; i <= M; i++) {
            String input = br.readLine();
            if (map1.containsKey(input)) {
                bw.write(map1.get(input) + "\n");
            } else {
                bw.write(map2.get(Integer.parseInt(input)) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
