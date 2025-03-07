package org.g14_집합과_맵;

import java.io.*;
import java.util.*;

public class 회사에_있는_사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            map.put(name, state.equals("enter"));
        }

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                bw.write(entry.getKey() + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
