package org.CLASS02;

import java.io.*;
import java.util.*;

public class 프린터_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priQueue = new PriorityQueue<>(Collections.reverseOrder());

            int idx = 0;
            while (st.hasMoreTokens()) {
                int t = Integer.parseInt(st.nextToken());
                queue.add(new int[]{idx++, t});
                priQueue.add(t);
            }

            int c = 1;
            while (true) {
                int[] now = queue.poll();

                if (now[1] == priQueue.peek()) {
                    if (now[0] == M) {
                        bw.write(c + "\n");
                        break;
                    }
                    priQueue.poll();
                    c++;
                } else {
                    queue.add(now);
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
