package org.g14_집합과_맵;

import java.io.*;
import java.util.*;

public class 서로_다른_부분_문자열의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        Set<String> list = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                list.add(input.substring(i, j));
            }
        }

        bw.write(list.size() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
