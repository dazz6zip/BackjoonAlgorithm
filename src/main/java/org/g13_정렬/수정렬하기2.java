package org.g13_정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int num : list) {
            bw.write(num + "\n");
        }

        bw.flush();
    }
}
